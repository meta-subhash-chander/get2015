/*
 * Java Script for cardakho.com
 */

var step=0;

var image=new Array();
    
	image[0]="./image/car1.jpg";
	
	image[1]="./image/car2.png";
	
	image[2]="./image/car3.jpg";
	
	
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



 

