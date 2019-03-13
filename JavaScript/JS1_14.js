function NNtable(arg) {
    var i=1,j;
    var temp;
    for(i;i<=arg;i++){
        for(j=1;j<=i;j++){
            temp=j*i;
            document.write(j+"*"+i+"="+temp+"\t");
        }
        document.write("<br/>");
    }
}