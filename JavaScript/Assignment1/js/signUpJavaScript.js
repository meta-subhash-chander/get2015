/*  activateSubmit function : use to enable submit butten */
		function activateSubmit() {
			if(document.getElementById("check").checked == true) {
				document.getElementById("submit").disabled = false;
			}
			else {
				document.getElementById("submit").disabled = true;
			}
		}
/*  validate function : use to validate form */
		function validate() {
			if(document.getElementById("first").value.trim() == "") {
				alert("First Name Is Empty");	
				return;
			} 
			if(document.getElementById("last").value.trim() == "") {
				alert("Last Name Is Empty");
				return;
			}
			 if(document.getElementById("password").value.length < 8 ){
				alert("Password Length should be greater than 8");
				return;
			}
			 if(document.getElementById("password").value != document.getElementById("confirm").value) {
				alert("Password & Re-Enter Password  mismatch!!");
				return;
			}
			if(document.getElementById("age").value< 18 ||document.getElementById("age").value >100 ){
				alert("age  should between 18 and 100");
				return;
			}
			 if(document.getElementById("state").selectedIndex == 0) {
				alert("Please select state") ;
				return;
			}
			if(document.getElementById("address").value.trim() == "") {
				alert("address Is Empty");
				return;
			}else{
				alert("User created successful");
				return;
			}
			}
			
/*  createCity function : use to dynamic changes into web page into select tag */		
		function createCity() {
			var cityObject = document.getElementById("city");
			var stateObject = document.getElementById("state");
			switch(stateObject.value) {
				case "Rajsthan" :
					cityObject.innerHTML = "<Option>Jaipur</option><Option>Bikaner</option><Option>Kota</option><Option>Ajmer</option>";
					break;
				case "MP" :
					cityObject.innerHTML = "<Option>Bilaspur</option><Option>Bhopal</option><Option>Gwalior</option><Option>Mandi</option>";
					break;
				case "UP" :
					cityObject.innerHTML = "<Option>Agra</option><Option>Kanpur</option><Option>Aligarh</option><Option>Mathura</option>";
					break;
				case "Maharastra":
					cityObject.innerHTML = "<Option>Mumbai</option><Option>Pune</option><Option>Aurangabad</option><Option>Thane</option>";
					break;
			}
		}
	
		
