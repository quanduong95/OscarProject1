package com.example.oscarproject.Controller;

import com.example.oscarproject.Model.Movie;
import com.example.oscarproject.Service.MovieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@WebMvcTest
class MovieControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private MovieService movieService;

    @Test
    void TestGetAllMovies() throws Exception {
        List<Movie> movies = movieService.getMovies();
        mvc.perform(get("/api/movies")).andExpect((ResultMatcher) movies);
    }

    @Test
    void findMovieByYear() {
    }

    @Test
    void findMovieByWinnerAndYear() {
    }

    @Test
    void findMovieByCategoryAndYear() {
    }

    @Test
    void findMovieByCategoryAndWinner() {
    }
}