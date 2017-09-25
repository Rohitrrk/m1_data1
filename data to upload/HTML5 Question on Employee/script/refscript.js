function preview(frm){

if(frm.checkValidity()){

	var win=window.open("","Preview","width=300,height=500");
	
	win.document.write("<html><head><title>Preview Data</title></head><body>");
	win.document.write("<h1>Preview Data</h1>");
	
	
	
	
	// win.document.write("<p>First Name is :"+ frm[0].value +"</p>");
	win.document.write("<p>First Name is :"+ frm.fname.value +"</p>");
	win.document.write("<p>Last Name is :"+ frm.lname.value +"</p>");
	win.document.write("<p>Contact Number is :"+ frm.contact.value +"</p>");
	win.document.write("<p>Email Address is :"+ frm[3].value +"</p>");
	win.document.write("<p>Date of Birth is :"+ frm[4].value +"</p>");

	win.document.write("<p>Location is :"+ frm[5].options[frm[5].selectedIndex].text +"</p>");
	win.document.write("<p>State is :"+ frm[5].value+"</p>");
		win.document.write("</body></html>");
	}
	
}
	// var city;
	// var state;
	// if(frm[5].selectedIndex==0)
		// {
		// city="Chennai";
		// state="Tamil Nadu";
		// }
	// if(frm[5].selectedIndex==1)
		// {
		// city="Mumbai";
		// state="Maharastra";
		// }
	// if(frm[5].selectedIndex==2)
		// {
		// city="Pune";
		// state="Maharastra";
		// }
	// if(frm[5].selectedIndex==3)
		// {
		// city="Banglore";
		// state="karanataka";
		// }
	// win.document.write("<p>City is :"+ city +"</p>");
	// win.document.write("<p>State is :"+ state +"</p>");
