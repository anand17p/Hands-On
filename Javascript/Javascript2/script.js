const nameTextBox = document.querySelector("#name");
const pushBtn = document.querySelector("#btn1");
const popBtn = document.querySelector("#btn2");
const displayBtn = document.querySelector("#btn3");
var x = 0;
var array = Array();
function push() {

    var name=document.getElementById("name").value;
    array.push(name)
    x++;
    document.getElementById("name").value = "";
    if(name===null||name==="")
    {
        document.getElementById("successMessege").innerHTML="Please enter the event name to add";  
        document.getElementById("successMessege").style.color="Red";
        document.getElementById("successMessege").style.textAlign="center";
    }
    else{
    document.getElementById("successMessege").innerHTML="Added successfully";
    document.getElementById("successMessege").style.color="green";
    document.getElementById("successMessege").style.textAlign="center";
    }
}
function pop() {

    var name=document.getElementById("name").value;
    array.pop(name)
    x++;
    if(name===null||name==="")
    {
        document.getElementById("successMessege").innerHTML="Please enter the event name to remove";  
        document.getElementById("successMessege").style.color="Red";
        document.getElementById("successMessege").style.textAlign="center";
    }
    else{
    document.getElementById("name").value = "";
    document.getElementById("successMessege").innerHTML="Removed successfully";
    document.getElementById("successMessege").style.color="green";
    document.getElementById("successMessege").style.textAlign="center"
    }

}
function displayEvent() {
    var Result=document.getElementById("Result");
    Result.innerHTML ="<h3>Event in the array</h3>"; 
    array.sort();
    var arrFiltered = array.filter(el => {
        return el != null && el != '';
    })
    for(var i=0;i<arrFiltered.length;i++)
    {
        
     Result.innerHTML +=(i+1)+"."+arrFiltered[i]+"<br/>";
     document.getElementById("Result").style.margin="auto";
     document.getElementById("Result").style.textAlign="center";

    }
   
     
     

}
