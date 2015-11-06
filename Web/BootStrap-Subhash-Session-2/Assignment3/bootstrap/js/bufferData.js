

function loadData() {

	var contentArray = [];

	var movie1 = {
		Title : "ABCD",
		Genere : "Romantic",
		Director : "Jignesh",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie2 = {
		Title : "ABCD2",
		Genere : "Thriller",
		Director : "Amit",
		Review : "Good",
		Rating : "Watchable"
	};

	var movie3 = {
		Title : "Golmaal",
		Genere : "Drama",
		Director : "Ankur",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie4 = {
		Title : "Golmaal returns",
		Genere : "Comedy",
		Director : "Anurag",
		Review : "Good",
		Rating : "Watchable"
	};

	var movie5 = {
		Title : "Sholey",
		Genere : "Thriller",
		Director : "Nikhil",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie6 = {
		Title : "Pyar ka Panchnama",
		Genere : "Horror",
		Director : "Rohit",
		Review : "Good",
		Rating : "Terrible"
	};

	var movie7 = {
		Title : "DDLJ",
		Genere : "Romantic",
		Director : "Khemanshu",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie8 = {
		Title : "MP3",
		Genere : "Romantic",
		Director : "Girdhari",
		Review : "Good",
		Rating : "Watchable"
	};

	var movie9 = {
		Title : "Wanted",
		Genere : "Action",
		Director : "Sanjay",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie10 = {
		Title : "Ready",
		Genere : "Comedy-Action",
		Director : "Pulkit",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie11 = {
		Title : "PK",
		Genere : "Drama",
		Director : "Akshat",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie12 = {
		Title : "Dhoom",
		Genere : "Action",
		Director : "Subhash",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie13 = {
		Title : "Dhoom2",
		Genere : "Action",
		Director : "Gaurav",
		Review : "Good",
		Rating : "Terrible"
	};

	var movie14 = {
		Title : "Dhoom3",
		Genere : "Action",
		Director : "Dheeraj",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie15 = {
		Title : "Dhoom4",
		Genere : "Action",
		Director : "Macontennish",
		Review : "Good",
		Rating : "Terrible"
	};

	var movie16 = {
		Title : "Dhoom5",
		Genere : "Action",
		Director : "Banwari",
		Review : "Good",
		Rating : "Best ever"
	};

	var movie17 = {
		Title : "Dhoom6",
		Genere : "Action",
		Director : "Tinkar",
		Review : "Good",
		Rating : "Terrible"
	};

	
	contentArray.push(movie1);
	contentArray.push(movie2);
	contentArray.push(movie3);
	contentArray.push(movie4);
	contentArray.push(movie5);
	contentArray.push(movie6);
	contentArray.push(movie7);
	contentArray.push(movie8);
	contentArray.push(movie9);
	contentArray.push(movie10);
	contentArray.push(movie11);
	contentArray.push(movie12);
	contentArray.push(movie13);
	contentArray.push(movie14);
	contentArray.push(movie15);
	contentArray.push(movie16);
	contentArray.push(movie17);

	  
	var tbody =$('#mytableTbody');
	for (var i = 0; i < contentArray.length; i++) {
		 
		tbody.append("<tr>" +"<td>" + contentArray[i].Title + "</td>" + "<td>"
				+ contentArray[i].Genere + "</td>" + "<td>"
				+ contentArray[i].Director + "</td>" + "<td>"
				+ contentArray[i].Review + "</td>" + "<td>"
				+ contentArray[i].Rating + "</td>" + "</tr>");
	}
}
