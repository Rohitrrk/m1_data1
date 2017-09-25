
	var postalCode;
	var storeLocation;


function showPreview(frm)
{
	 if(frm.selState.selectedIndex==1)
	 {
	 postalCode=560000;
	 storeLocation='Bangalore';
	 }
	 
	 if(frm.selState.selectedIndex==2)
	 {
	 postalCode=600000;
	 storeLocation='Chennai';
	 }
	
	if(frm.selState.selectedIndex==3)
	 {
	 postalCode=680000;
	 storeLocation='Thiuvananthapuram';
	 }
	 
	if(frm.selState.selectedIndex==4)
	 {
	 postalCode=500000;
	 storeLocation='Hyderabad';
	 }
	
	alert('Postal Code '+postalCode+' And Location is '+storeLocation);
	
}



function showDetails(frm)
{
	
if(frm.checkValidity()){

	var win=window.open("","Customer Details","width=500,height=500");
	
		var message = "<html><head><title>Customer Details</title></head><body><table>";
		
		message += "<tr><td>Cutomer Name</td><td>"+frm[0].value+"</td></tr>";
		
		message += "<tr><td>Cutomer Address </td><td>"+frm[1].value+"</td></tr>";
		
		message += "<tr><td>State Name</td><td>"+ frm[2].options[frm[2].selectedIndex].text +"</td></tr>";
		
		
	 if(frm.selState.selectedIndex==1)
	 {
	 postalCode=560000;
	 storeLocation='Bangalore';
	 }
	 
	 if(frm.selState.selectedIndex==2)
	 {
	 postalCode=600000;
	 storeLocation='Chennai';
	 }
	
	if(frm.selState.selectedIndex==3)
	 {
	 postalCode=680000;
	 storeLocation='Thiuvananthapuram';
	 }
	 
	if(frm.selState.selectedIndex==4)
	 {
	 postalCode=500000;
	 storeLocation='Hyderabad';
	 }
	 
	 
		
		message += "<tr><td>Postal Code</td><td>"+postalCode+"</td></tr>";
		
		message += "<tr><td>Store Location</td><td>"+storeLocation+"</td></tr>";
		
		message += "<tr><td>Phone Number </td><td>"+frm[3].value+"</td></tr>";
		
		message += "<tr><td>Cutomer Email </td><td>"+frm[4].value+"</td></tr>";
		
		message += "<tr><td>Preferred Way To Contact </td><td>"+frm[5].value+"</td></tr>";
		
		message += "<tr><td>Date of Visit </td><td>"+frm.date_visit.value+"</td></tr>";
		
		message += "<tr><td>Incident Description </td><td>"+frm.txtIncident.value+"</td></tr>";
		
		message += "</table></body></html>";
		win.document.write(message);
	
	}
		
}