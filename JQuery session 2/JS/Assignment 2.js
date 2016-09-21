$(document).ready(function() {
    $("#submit").click(getResult);
});

function getResult() {
    var employees = [
        {
            "Name":"Paul",
            "Email":"paul@google.com",
            "DOB":"31/9/1555",
            "Address":"Swarn path, Mansarovar"
        },
        {
            "Name":"Almond",
            "Email":"Almond@google.com",
            "DOB":"01/9/1555",
            "Address":"Vijay path, Mansarovar"
        },
        {
            "Name":"Cris",
            "Email":"cris@google.com",
            "DOB":"21/9/1555",
            "Address":"thadi market, Mansarovar"
        },
        {
            "Name":"Jack",
            "Email":"jack@google.com",
            "DOB":"31/4/1555",
            "Address":"Kiran, Mansarovar"
        }
    ];
    var employeeName = $('select').val();
    var i;
    for(i = 0; i < employees.length; i++){
        if(employees[i].Name == employeeName){
            $('#result').html("<br />Name : " + employees[i].Name + "&nbsp;&nbsp;&nbsp;&nbsp;" + "Email : " + employees[i].Email + "<br /> DOB: " + employees[i].DOB + "&nbsp;&nbsp;&nbsp;&nbsp;" + "Address : " + employees[i].Address); 
        }
    }
}