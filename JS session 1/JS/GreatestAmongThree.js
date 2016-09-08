function getGreatest() {
	var x = parseInt(document.getElementById("num1").value);
	var y = parseInt(document.getElementById("num2").value);
	var z = parseInt(document.getElementById("num3").value);

	if(x > y){
		max = x;
	} else {
		max = y;
	}

	if(max > z){
		document.getElementById("output").value = max;
	} else {
		document.getElementById("output").value = z;
	}
}