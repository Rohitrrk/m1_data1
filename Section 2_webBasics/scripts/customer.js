
function newWindow(frm){
	if(frm.checkValidity())
	{
       var win=window.open("","customer details","width=300,height=500");
	
	win.document.write("<html><head><title>Customer Data</title></head><body>");
	win.document.write("<h1>Customer Data</h1>");
	
	
	win.document.write("<p>First Name is :"+ frm.name.value +"</p>");
	win.document.write("<p>Address is :"+ frm.address.value +"</p>");
	win.document.write("<p>State is :"+ frm.ddlcity.value +"</p>");
	win.document.write("<p>Mobile number is :"+ frm.txtmob.value +"</p>");
	win.document.write("<p>Email is :"+ frm.txtmail.value +"</p>");
	win.document.write("<p>Preffered contact is :"+ frm.txtpre.value +"</p>");
	win.document.write("<p>Date of visit is :"+ frm.txtdov.value +"</p>");
	win.document.write("<p> Describe the incident :"+ frm.comment.value +"</p>");
	
		win.document.write("</body></html>");
	}
	}
	
