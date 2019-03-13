var db, request, objectStore;
function createDB(dbName) {
    request = indexedDB.open(dbName, 1);
    request.onerror = function () {
        alert("Fail to access to database: "+request.error);
    }
    request.onsuccess = function () {
        alert("Succeed in accessing!");
        db = request.result;
        var transaction = db.transaction("user", "readwrite");
        objectStore = transaction.objectStore("user");
    }
    request.onupgradeneeded = function () {
        alert("Version has been changed!");
        db = request.result;
        objectStore = db.createObjectStore("user", {keyPath: "userNo"});
        var userNoIndex = objectStore.createIndex("by_userNo", "userID", {unique: true});
        //var usernameIndex = objectStore.createIndex("by_index", "username");
        //var userageIndex = objectStore.createIndex("by_age", "userage");
        //var usesexIndex = objectStore.createIndex("by_sex", "usersex");
    }
}
function deleteDB(dbName) {
    request = indexedDB.deleteDatabase(dbName);
    request.onerror = function () {
        alert("Fail to delete database!");
    }
    request.onsuccess = function () {
        alert("Succeed in deleting database!");
        var ta = document.getElementById("display");
        ta.innerHTML = "";
        window.location.reload();
    }
}
function getObject() {
    var txtAear = document.getElementById("display");
    txtAear.innerText = "";
    if(!db){
        alert("Please open database first!");
        return false;
    }
    else{
        var store = db.transaction("user").objectStore("user");
        var keyRange = IDBKeyRange.lowerBound(0);
        var cursorRequest = store.openCursor(keyRange);
        cursorRequest.onsuccess = function () {
            var result = cursorRequest.result;
            document.getElementById("check_value").innerHTML += result;
            if(result){
                getOneObject(result.value);
                result.continue();
            }
            document.getElementById("check_value").innerHTML += result;
        }
        cursorRequest.onerror = function () {
            alert("Fail to get data!");
        }
    }
}
function getOneObject(e) {
    var ta = document.getElementById("display");
    ta.innerHTML += "ID number: "+e.userNo+" Name: "+e.username +", age: "+e.userage+" sex: "+e.usersex+"\n";
}
function addObject() {
    //document.write("<h3>#######2</h3>");
    var userID = document.getElementById("id-num").value;
    var uname = document.getElementById("name").value;
    var uage = document.getElementById("age").value;
    var usex, flag = document.getElementById("sex-m").checked;
    usex = (flag)?"male":"female";
    if(userID.length>0 && uname.length>0 && uage>1) {
        var detail = {userNo: userID, username: uname, userage: uage, usersex: usex};
        if (!db) {
            alert("Please open database!");
            return false;
        } else {
            var transaction = db.transaction(["user"], "readwrite");
            objectStore = transaction.objectStore("user");
            objectStore.add(detail);
            alert("Add data successfully!");
        }
    }
}