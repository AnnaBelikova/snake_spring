$(document).ready(function() {

    $.ajax({
        url: "http://localhost:8080/snake"
    }).then(function(data, status, jqxhr) {
       $('.field-col').append(data.col);
       $('.field-row').append(data.row);
       console.log(jqxhr);
    });
});

console.log("1");