 
$(document).ready(function() {
	$("p").siblings("h1").css({
		"color" : "red",
		"border" : "2px dashed green"
	});
	$("p").parents().parentsUntil("html").css({"border": "2px solid blue"});
	 $("p").next().css({"border": "2px solid pink"});
});
