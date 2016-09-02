var x = document.getElementById('result');
function getLocation(){
	if(navigator.geolocation){
		navigator.geolocation.getCurrentPosition(showPosition);
	}else{
		x.innerHTML = "Your brower doesnt support geolocation";
	}
}

function showPosition(position){
	  x.innerHTML = "Latitude: " + position.coords.latitude +
    "<br>Longitude: " + position.coords.longitude;
}