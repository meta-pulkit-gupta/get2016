$(document).ready(init);

function init(){
    $('#start').click(start);
    $('#stop').click(stop);
    $('#back').click(back);
    $('#left').click(left);
    $('#right').click(right);
    $('#top').click(moveTop);
    $('#bottom').click(bottom);
};

function start(){
        $('#mydiv').stop();
        $('#mydiv').animate({
            left: "+=500px"
        }, 2000);
}

function stop(){
    $('#mydiv').stop();
}

function back(){
    $('#mydiv').stop();
     $('#mydiv').animate({
            left: "-=500px"
    }, 2000);
}

function left(){
    $('#mydiv').stop();
     $('#mydiv').animate({
            left: "-=50px"
    }, 1000);
}

function right(){
    $('#mydiv').stop();
     $('#mydiv').animate({
            left: "+=50px"
    }, 1000);
}

function moveTop(){
    $('#mydiv').stop();
     $('#mydiv').animate({
            top: "-=50px"
    }, 1000);
}

function bottom(){
    $('#mydiv').stop();
     $('#mydiv').animate({
            top: "+=50px"
    }, 1000);
}