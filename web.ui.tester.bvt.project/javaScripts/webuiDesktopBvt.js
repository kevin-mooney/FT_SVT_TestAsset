function getParameterAndEnterInEditBoxes(var1){
		console.log("Calling getParameterAndEnterInEditBoxes function");
		var2 = var1;
		document.getElementById("yourName").value = var2;
		return "fromJSCustomCodeBySubstitutingTheVariable";
}

function getParameterAndEnterInEditBoxes1(var1, var2){
		console.log("Calling getParameterAndEnterInEditBoxes function");
		var3 = var1 + var2;
		document.getElementById("yourName").value = var3;
}

function clickAndEnterTextInYourNameTextBox(){
	console.log("Calling clickAndEnterTextInYourNameTextBox function");
	document.getElementById("yourName").value = "coming from java script custom code";
}

