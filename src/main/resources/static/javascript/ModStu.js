backupFN = document.getElementById('fValue').value;
backupLN = document.getElementById('lValue').value;
backupW = document.getElementById('WValue').value;
backupH = document.getElementById('HValue').value;
backupHC = document.getElementById('HCValue').value;
backupG = document.getElementById('GValue').value;
backupCG = document.getElementById('CGValue').value;
backupID = document.getElementById('IDValue').value;
document.getElementById("IDValueF").value = backupID;
console.log("The ID is: "+ document.getElementById("IDValueF").value)
console.log(backupFN, backupLN, backupW, backupH, backupHC, backupG, backupCG, backupID);
document.getElementById('SubmitBoxCheck').addEventListener('click', testExists);
function testExists() {
    document.getElementById("fValueF").value = document.getElementById("fValue").value;
    document.getElementById("lValueF").value = document.getElementById("lValue").value;
    document.getElementById("WValueF").value = document.getElementById("WValue").value;
    document.getElementById("HValueF").value = document.getElementById("HValue").value;
    document.getElementById("HCValueF").value = document.getElementById("HCValue").value;
    document.getElementById("GValueF").value = document.getElementById("GValue").value;
    document.getElementById("CGValueF").value = document.getElementById("CGValue").value;
    if(document.getElementById("fValueF").value == "" || document.getElementById("fValueF").value == null){
        document.getElementById("fValueF").value = backupFN;
    }
    if(document.getElementById("lValueF").value == "" || document.getElementById("lValueF").value == null){
        document.getElementById("lValueF").value = backupLN;
    }
    if(document.getElementById("WValueF").value == "" || document.getElementById("WValueF").value == null || isNaN(document.getElementById("WValueF").value)){
        document.getElementById("WValueF").value = backupW;
    }
    if(document.getElementById("HValueF").value == "" || document.getElementById("HValueF").value == null || isNaN(document.getElementById("HValueF").value)){
        document.getElementById("HValueF").value = backupH;
    }
    if(document.getElementById("HCValueF").value == "" || document.getElementById("HCValueF").value == null){
        document.getElementById("HCValueF").value = backupHC;
    }
    if(document.getElementById("GValueF").value == "" || document.getElementById("GValueF").value == null || isNaN(document.getElementById("GValueF").value)){
        document.getElementById("GValueF").value = backupG;
    }
    if(document.getElementById("CGValueF").value == "" || document.getElementById("CGValueF").value == null || isNaN(document.getElementById("CGValueF").value)){
        document.getElementById("CGValueF").value = backupCG;
    }
    document.getElementById("IDValueF").value = backupID;
    document.getElementById("SubmitBoxCheckF").click();
}





