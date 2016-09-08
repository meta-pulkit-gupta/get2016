function Add10() {
	var value = prompt("Enter value");
	document.getElementById('output1').innerHTML = value + 10;
	document.getElementById('output2').innerHTML = parseInt(value) + 10;
}
Add10();