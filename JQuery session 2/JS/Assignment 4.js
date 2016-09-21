$(document).ready(init);

function init(){
    $('.field').bind('input', function(){
        $('#myDiv1').html($(this).attr('id') + " : " + $(this).val());
        var object = this;
        setTimeout(function(){
            $(object).css("background-color","grey");
        }, 20);
        setTimeout(function(){
            $(object).css("background-color","white");
        }, 1000);
    });
}