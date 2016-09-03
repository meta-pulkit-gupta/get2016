function getInput(){
    var rows;
    do{
        rows = prompt("Enter number of rows");
    }while(isNaN(rows));
    return rows;
}

function forPyramid(){
    var rows = getInput();
    for(var i = 1; i <= rows; i++){
        for(var j = 1; j <= (rows - i); j++){
            document.getElementById('pyramid').innerHTML += "&nbsp;&nbsp;&nbsp;";
        }
        
        for( var j = 1; j <= (i * 2) - 1; j++){
             document.getElementById('pyramid').innerHTML += "* ";
        }
        
        document.getElementById('pyramid').innerHTML += "<br />";
    }  
}

function whilePyramid(){
    var rows = getInput();
    var i = 1;
    while(i <= rows){
        var j = 1;
        while(j <= (rows - i)){
              document.getElementById('pyramid').innerHTML += "&nbsp;&nbsp;&nbsp;"; 
            j++;
        }
        
        j = 1;
        
        while(j <= (i * 2) - 1){
            document.getElementById('pyramid').innerHTML += "* ";
            j++;
        }
        
        document.getElementById('pyramid').innerHTML += "<br />";
        i++;
    }
}

function doWhilePyramid(){
    var rows = getInput();
    var i = 1;
    do{
        var j = 1;
        while(j <= (rows - i)){
              document.getElementById('pyramid').innerHTML += "&nbsp;&nbsp;&nbsp;"; 
            j++;
        }
        
        j = 1;
        
        while(j <= (i * 2) - 1){
            document.getElementById('pyramid').innerHTML += "* ";
            j++;
        }
        
        document.getElementById('pyramid').innerHTML += "<br />";
        i++;
    }while(i <= rows)
}
