document.getElementById("StudentName").addEventListener("click",DelStudentName)
document.getElementById("Studentid").addEventListener("click",DelStudentID)
document.getElementById("DisplayStudents").addEventListener("click", bypassButton )


function bypassButton(){
   
    document.getElementById("hiddenButton").click();
}
function DelStudentName(){
    if(document.getElementById("fValue").value== ""){
        window.alert("No first name.");
    }else if(document.getElementById("lValue").value== ""){
        window.alert("No last name.");
    }else{
        document.getElementById("fullNameF").value=document.getElementById("fValue").value+" "+document.getElementById("lValue").value;
        document.getElementById("SubmitFullName").click();
    }
   
}


function DelStudentID(){
    if(document.getElementById("idValue").value== ""||document.getElementById("idValue").value==null||isNaN(document.getElementById("idValue").value)){

        window.alert("Student ID must be a number.");
    }else{
        document.getElementById("fullIDF").value=document.getElementById("idValue").value;
        document.getElementById("SubmitFullID").click();
    }
}