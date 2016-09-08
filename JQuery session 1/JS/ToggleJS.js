function toggle(){
    var spanMessage = document.getElementById("message");
    var toggleButton = document.getElementById("toggle");
    
    if(spanMessage.style.display == 'none'){
        spanMessage.style.display = 'inline';
        toggleButton.value = "hide";
    }else{
        spanMessage.style.display = 'none';
        toggleButton.value = "show";
    }
}