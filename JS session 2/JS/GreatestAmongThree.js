function getGreatest() {
	var x = parseInt(document.getElementById("num1").value);
	var y = parseInt(document.getElementById("num2").value);
	var z = parseInt(document.getElementById("num3").value);
    document.getElementById("output").value = computeGreatest(x,y,z);
}
    
function computeGreatest(x,y,z){    
    if(x > y){
		max = x;
	} else {
		max = y;
	}

	if(max > z){
		return max;
	} else {
		return z;
	}
}