var max = 0;
function getInput(){
    do{
    var x = prompt("Enter number of elements in histogram");
    while(isNaN(x));
    var i = 0;
    var arrayElement = new Array(x);
    do{
        rows = parseInt(prompt("Enter size of " + (i + 1) + " elements"));
        if(!isNaN(rows)){
            arrayElement[i] = rows;
            i++;
            if(max < rows){
                max = rows;
            }
        }
    }while(i < x);
    return arrayElement;
}

function get(){ 
    var arrayElement = getInput();
    for(var i = 0; i < max; i++){
        for(var j = 0; j < arrayElement.length; j++){
            if(arrayElement[j] < max - i){
                document.getElementById('result').innerHTML += "&nbsp;&nbsp;"; 
            }else{
                document.getElementById('result').innerHTML += " * "; 
            }
        }
        document.getElementById('result').innerHTML += "<br />";
    }
}