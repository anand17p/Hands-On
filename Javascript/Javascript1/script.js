function addRow() {
    var id = document.getElementById("id")
    var name = document.getElementById("name");
    var price = document.getElementById("price")
    var table = document.getElementById("myTableData")
    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);
    row.insertCell(0).innerHTML = + id.value;
    row.insertCell(1).innerHTML = name.value;
    row.insertCell(2).innerHTML = + price.value;
    row.insertCell(3).innerHTML = '<input type="number" id="mynumber" min="1" max="10" step="1" value="1" size="4">';
    row.insertCell(4).innerHTML = '<input type="button" value = "Remove" onClick="Javacsript:deleteRow(this)">';
    document.getElementById("Result").innerHTML = "The total price is " + update();
}

function update() {
    var id = document.getElementById("id")
    var name = document.getElementById("name");
    var price = document.getElementById("price")
    var table = document.getElementById("myTableData")
    sumVal = 0;
    for (var i = 1; i < table.rows.length; i++) {
        var quantityElement = document.getElementById("mynumber");
        var quantity = quantityElement.value
        var totalPrice = parseInt(table.rows[i].cells[2].innerHTML);
        sumVal = sumVal + (totalPrice * quantity)
    }
    return sumVal;
}

function deleteRow(obj) {
    var index = obj.parentNode.parentNode.rowIndex;
    var table = document.getElementById("myTableData");

    table.deleteRow(index);
}

