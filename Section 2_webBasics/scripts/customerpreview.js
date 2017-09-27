function code_location(frm)
{
	if(frm.checkValidity())
	{
	var win=window.open("","postal  details","width=300,height=500");
       var state;
		state=frm.ddlcity.value;
		if(state == 'karnataka')
		{
			win.document.write("postal code:560000 AND store location:Banglore");
		}
		else if(state=='Tamilnadu')
		win.document.write("postal code:600000 AND store location:Chennai");
		else if(state=='Kerela')
		win.document.write("postal code:680000 AND store location:Thiruvananthapuram");
		else
		win.document.write("postal code:500000 AND store location:Hyderabad");
	}


}