function getInput(){
    var number;
    do{
        number = prompt("Enter number");
    }while(isNaN(number));
    return number;
}

function get(){
    var number = getInput();
    document.getElementById('table').innerHTML = "";
    for(var i = 1; i <= 10; i++){
        document.getElementById('table').innerHTML += number + " * " + i + " = " +(number * i) + "<br />";
    }
}