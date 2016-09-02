
function clickCounter(){
	if(typeof(Storage) !== "undefined"){
		if(localStorage.clickCount){
			localStorage.clickCount = Number(localStorage.clickCount) + 1;
		} else {
			localStorage.clickCount = 1;
		}
		 document.getElementById("output").innerHTML = "You have clicked the button " + localStorage.clickCount + " time(s).";
	}else{
		 document.getElementById("output").innerHTML = "Sorry, your browser does not support web storage...";
	}
}