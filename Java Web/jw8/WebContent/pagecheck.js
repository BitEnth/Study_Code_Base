/**
 * for hyperlink
 */
function pagecheck(current, least, last){
	if(current == least){
		const f1 = document.getElementById("pp");
		alert("askldkald");
		f1.disabled = true;
	}
	if(last == current){
		const f2 = document.getElementById("np");
		f2.disabled = true;
	}
}
