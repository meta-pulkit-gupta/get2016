$(document).ready(function(){
    $("#btn1").click(question1);
    $("#btn2").click(question2);
    $("#btn3").click(question3);
    $("#btn4").click(question4);
    $("#btn5").click(question5);
    $("#btn6").click(question6);
    $("#btn7").click(question7);
    $("#btn8").click(question8);
    $("#btn9").click(question9);
    $("#btn10").click(question10);
});

function question1(){
    $(".message").css("color", "red"); 
}

function question2(){
    $("div.box:first").hide(); 
}

function question3(){
    $(":button").attr("value", "Submit"); 
}

function question4(){
    $("img[alt=hello]").attr("alt", "Hi!");
}

function question5(){
    $("#mydiv input[type=text]").hide();
}

function question6(){
    $("input[name^=txt]").hide();
}

function question7(){
    $("p:not(.box)").hide();
}

function question8(){
    $("div.box,div.error").css("background", "red");
}

function question9(){
    $("div.error.box").css("background", "red");
}

function question10(){
    $("#myDiv .info").css("color", "red");
}
