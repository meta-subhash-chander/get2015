/*
 * Java Script for cardakho.com
 */
var step=0;
/* create array of image */
var image=new Array();
    
	image[0]="../image/car1.jpg";
	
	image[1]="../image/car2.png";
	
	image[2]="../image/car3.jpg";
/* dynamic changes into pages according to user type */	
	function visiblityOfCreate(){
		
	if(localStorage.getItem("userType")=="user"){
		
		var li1=document.getElementById("create");
		li1.innerHTML="";
		var li2=document.getElementById("logout");
		li2.innerHTML="";
		
	}
	
	}
	/* dynamic changes into pages according to user type */	
	function visiblityOfEdit(){
		if(localStorage.getItem("userType")=="user"){
			
			var a1=document.getElementById("edit1");
			a1.innerHTML="";
			var a2=document.getElementById("edit2");
			a2.innerHTML="";
			var a3=document.getElementById("edit3");
			a3.innerHTML="";
			var a4=document.getElementById("edit4");
			a4.innerHTML="";
			var a5=document.getElementById("edit5");
			a5.innerHTML="";
		}
		else if(localStorage.getItem("userType")=="admin"){
			var a1=document.getElementById("edit1");
			a1.innerHTML="Edit";
			var a2=document.getElementById("edit2");
			a2.innerHTML="Edit";
			var a3=document.getElementById("edit3");
			a3.innerHTML="Edit";
			var a4=document.getElementById("edit4");
			a4.innerHTML="Edit";
			var a5=document.getElementById("edit5");
			a5.innerHTML="Edit";
		}
		
		}
/* function for image slides*/	
function imageSlider(){ 
	if (step<2)
	{ step++;
	
	}
	else
	{	  step=0;

	}
	document.getElementById("imageslider").src=image[step];
    setTimeout("imageSlider()",1500);
}
/* function for valid admin */	
function isValidAdmin()
{
var username=document.getElementById("username").value;
var password=document.getElementById("pwd").value;
if(username!="subhash"){
	alert("Invalid Username or password");
	return false;
}
else if(password!="1234"){
	alert("Invalid Username or password");
	return false;
}else{
	localStorage.userType= "admin";
	alert(localStorage.getItem("userType"));
	return true;
}

}
/* set the user  */	
function setUser(){
	localStorage.userType= "user";
}
/* set roadTax and roadPrice on car*/	
function setroadTax(){
	
	document.getElementById("roadtax").value=(document.getElementById("showroomprice").value*5)/100;
	document.getElementById("roadprice").value=Number((document.getElementById("showroomprice").value))+Number((document.getElementById("roadtax").value));
}
/* car Engine Detail Verify*/
function EngineDetailVerify(){
	if(document.getElementById("engine").value < 700 |document.getElementById("engine").value > 5000) {
		alert("provide engine cc between 700-5000");
	}
	else if(document.getElementById("fuel").value > 100 | document.getElementById("fuel").value < 10) {
		alert("provide fuel capacity between 10-100");
	}
	else if(document.getElementById("fuel").value > 100 | document.getElementById("fuel").value < 10) {
		alert("provide fuel capacity between 10-100");
	}
	else if(document.getElementById("milage").value > 40 | document.getElementById("milage").value < 1) {
		alert("provide milage  between 1-40");
	}
}
 
