function showAlert(){
    var dropDown;
    var getRadioOptions = document.getElementsByName('dropdown');
    if(getRadioOptions[0].checked){
        dropDown = document.getElementById('city');
        message = "City : " + dropDown.options[dropDown.selectedIndex].value;
    }else{
        dropDown = document.getElementById('state');
        message = "State : " + dropDown.options[dropDown.selectedIndex].value;
    }
    window.alert(message);
}