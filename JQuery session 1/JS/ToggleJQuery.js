$(document).ready(function(){
   $("#togglee").click(function(){
        $("#message").toggle();
       if($(this).val() == "Hide"){
           $(this).val("Show");
           
       }else{
           $(this).attr("value","Hide");
       }
   });
});