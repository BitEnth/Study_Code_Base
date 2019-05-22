function idCheck(e) {
    var idString=e.value;
    var patt= new RegExp("^[0-9]{8}$");
    var bool = patt.test(idString);
    if(bool==false){
        alert("Wrong format! must be eight numbers!");
        e.value = "";
    }
    return;
}
