var tenInt = new Array(10);
function createTenInt() {
    for(var i=0;i<10;i++){
        tenInt[i]=Math.floor(Math.random()*90+10);
    }
    postMessage(tenInt.sort());
}
setTimeout("createTenInt()", 1000);
createTenInt();