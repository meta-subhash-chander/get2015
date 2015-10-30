

$(document).ready(function(){
    $(".button1").click(function(){
    	$(".div1").stop();
        $(".div1").animate({left: '1300px'},5000);
    });

    $(".button2").click(function(){
    	$(".div1").stop();
        $(".div1").animate({left: '0px'},5000);
    });
    
    $(".button3").click(function(){
        $(".div1").stop();
    });
    
    $(".button4").click(function(){
    	$(".div1").animate({left: '-=50px'});
    	
    });
    
    $(".button5").click(function(){
    	$(".div1").animate({left: '+=50px'});
    	
    });
    
    $(".button6").click(function(){
    	$(".div1").animate({top: '-=50px'});
    	
    });
    
    $(".button7").click(function(){
    	$("div").animate({top: '+=50px'});
    	
    });
    
    
});