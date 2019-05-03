function getLinks(searchProduct){
setTimeout(wait, 20000);
         var search=document.getElementsByClassName("sk-hits-list");
         var links=search[0].getElementsByTagName('a');

	var noOfLink=0;
	for (i = 0; i < links.length; i++) { 
  		if ((links[i].text).search(searchProduct)!=-1){
       		noOfLink=noOfLink+1;
     	}
  	}
  return noOfLink.toString();
}
function wait(){
}