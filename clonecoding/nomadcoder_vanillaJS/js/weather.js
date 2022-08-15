
const API_KEY = "ad3f88d4c1876ebb8d3e1c520db02fac"

function onGeoOk(position) {
    const lat = position.coords.latitude;
    const lon = position.coords.longitude;
    const url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=${API_KEY}&units=metric`;
    fetch(url).then(response => response.json()).then(data =>{
        const weather = document.querySelector('#weather span:first-child');
        const City = document.querySelector('#weather span:last-child');
        City.innerText = data.name;
        weather.innerText = `${data.weather[0].main} / ${data.main.temp}`;
    });
}

function onGeoError() {
    alert("위치를 받아오는데 실패했습니다.")
}

navigator.geolocation.getCurrentPosition(onGeoOk, onGeoError);