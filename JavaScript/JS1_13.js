function emailCheck(e) {
    var emailString=e.value;
    var patt= new RegExp("^([A-Za-z0-9_])+\@([A-Za-z0-9_])+\.(([A-Za-z]{2,4})|([A-Za-z]{2,4}\.[A-Za-z]{2,4}))$");
    var bool = patt.test(emailString);
    if(bool==false){
        alert("Wrong email!");
    }
    else{
        alert("Right!");
    }
    return;
}