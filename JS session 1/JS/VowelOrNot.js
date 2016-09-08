function VowelOrNot(){
	var char = document.getElementById('character').value;
	if(char.length != 1){
		document.getElementById('output').innerHTML = "Enter valid character";
	} else {
		char = char.toLowerCase();
	switch(char){
		case "a" :
		case "e" :
		case "i" :
		case "o" :
		case "u" :
			document.getElementById('output').innerHTML = "It is a vowel";
			break;
		default :
			document.getElementById('output').innerHTML = "It is a Consonant";
		}	
	}
}