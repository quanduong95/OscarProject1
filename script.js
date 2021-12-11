function fetchData() {
    fetch("http://localhost:8010/api/movies/year/1960", {
        method: 'GET',
        mode: 'no-cors'
    }).then( response => {
        return response.json();
    }).then(data => {
        console.log(data)
    });
}
fetchData();