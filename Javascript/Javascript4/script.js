const nameTextBox = document.querySelector("#name");
const saveBtn = document.querySelector("#btn1");
const displayBtn = document.querySelector("#btn2");
var x = 0;
var array = Array();
function addEvent() {
    var name = document.getElementById("name").value;
    if (name === null || name === "") {
        document.getElementById("successMessege").innerHTML = "Please enter the event name to add";
        document.getElementById("successMessege").style.color = "Red";
        document.getElementById("successMessege").style.textAlign = "center";
    }
    else if (array.length === 0) {
        array.push(name);
        document.getElementById("name").value = "";
        document.getElementById("successMessege").innerHTML = "Event name added successfully";
        document.getElementById("successMessege").style.color = "green";
        document.getElementById("successMessege").style.textAlign = "center"
    }

    else if (array.includes(name)) {
        document.getElementById("successMessege").innerHTML = "Event name already exist.Try with some other name";
        document.getElementById("successMessege").style.color = "Red";
        document.getElementById("successMessege").style.textAlign = "center";
    }
    else {
        array.push(name)
        document.getElementById("name").value = "";
        document.getElementById("successMessege").innerHTML = "Event name added successfully";
        document.getElementById("successMessege").style.color = "green";
        document.getElementById("successMessege").style.textAlign = "center"
    }
}
function displayEvent() {
    var table = "<table style='border: 1px solid black;border-collapse:collapse' width=10% align=center><tr><td style='border: 1px solid black' align=center ><b>Event</b></td></tr>";
    var arrFiltered = array.filter(el => {
        return el != null && el != '';
    })
    for (var i = 0; i < arrFiltered.length; i++) {

        table += "<tr><td style='border: 1px solid black;text-align:left'>" + arrFiltered[i] + "</td></tr>";
    }
    table += "</table>";
    document.getElementById("Result").innerHTML = table;

}
