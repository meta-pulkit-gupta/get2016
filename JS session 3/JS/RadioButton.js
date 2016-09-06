function combination(){
    var message = "";
    var frontend = document.getElementsByName('backend');
    var backend = document.getElementsByName('frontend');
    
    if(frontend[0].checked){
        message += "Frontend : " + frontend[0].value;
    } else{
        message += "Frontend : " + frontend[1].value;
    }
    
    if(backend[0].checked){
        message += " backend : " + backend[0].value;
    } else{
        message += " backend : " + backend[1].value;
    }
    window.alert(message);
}