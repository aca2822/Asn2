
document.getElementById("SubmitBoxCheck").addEventListener("click", testExist);

function testExist() {
    first = document.getElementById("fValue");
    last = document.getElementById("lValue");
    weight = document.getElementById("WValue");
    height = document.getElementById("HValue");
    hairColor = document.getElementById("HCValue");
    GPA = document.getElementById("GValue");
    CGPA = document.getElementById("CGValue");
    console.log(first.value, last.value, weight.value, height.value, hairColor.value, GPA.value, CGPA.value);
    if(first.value == ""|| first.value == null || first.value == undefined){
        window.alert("No first name.");
    }
    else if(last.value == ""|| last.value == null || last.value == undefined){
        window.alert("No last name.");
    }
    else if(parseFloat(weight.value) <= 0 || parseFloat(weight.value) == null || parseFloat(weight)== undefined|| isNaN(parseFloat(weight.value))){
        window.alert("Weight must be a positive number.");
    }
    else if(parseFloat(height.value) <= 0 || parseFloat(height.value) == null || parseFloat(height)== undefined|| isNaN(parseFloat(height.value))){
        window.alert("Height must be a positive number.");
    }
    else if(hairColor.value == ""|| hairColor.value == null || hairColor== undefined){
        window.alert("No hair color.");
    }
    else if(parseFloat(GPA.value) <= 0 || parseFloat(GPA.value) == null || parseFloat(GPA)== undefined|| isNaN(parseFloat(GPA.value))){
        window.alert("GPA must be a positive number.");
    }
    else if(parseFloat(CGPA.value) <= 0 || parseFloat(CGPA.value) == null || parseFloat(CGPA)== undefined|| isNaN(parseFloat(CGPA.value))){
        window.alert("CGPA must be a positive number.");
    }else{
        document.getElementById("fValueF").value = first.value;
        document.getElementById("lValueF").value = last.value;
        document.getElementById("WValueF").value = weight.value;
        document.getElementById("HValueF").value = height.value;
        document.getElementById("HCValueF").value = hairColor.value;
        document.getElementById("GValueF").value = GPA.value;
        document.getElementById("CGValueF").value = CGPA.value;
        document.getElementById("SubmitBoxCheckF").click();
    }

}
