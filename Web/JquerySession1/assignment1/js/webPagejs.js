function helloFunction(){
	
		document.getElementById("hiddenLabel").style.visibility = "visible";
        document.getElementById("hiddenLabel").style.display = "inline";
		
}
function helloFunction1(){
	
		document.getElementById("hiddenLabel").style.visibility = "hidden";
        document.getElementById("hiddenLabel").style.display = "none";
		
}
function helloFunction2(){ 
		if(document.getElementById("hiddenLabel").style.visibility == "visible"){
			document.getElementById("hiddenLabel").style.visibility = "hidden";
            document.getElementById("hiddenLabel").style.display = "none";
		}else{
			document.getElementById("hiddenLabel").style.visibility = "visible";
           document.getElementById("hiddenLabel").style.display = "inline";
		}
        
		
}