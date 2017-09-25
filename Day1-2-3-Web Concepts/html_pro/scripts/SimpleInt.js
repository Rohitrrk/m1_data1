/*function calSI(p,n,r)
{
	var si = parseFloat(p.value) * parseInt(n.value)
		parseFloat(r.value);

	//alert('Simple Interest is '+si);
	document.getElementById("res").innerHTML = 'Simple Interest is '+si/100;
}*/

function calSI(frm)
{
	if(frm.checkValidity()){

	var win=window.open("","Simple Interest","width=300,height=500");
	
	var message = "<html><head><title>Simple Interest Details..</title><style>*{font-Family:'Segoe UI';}</style></head><body>";
	
	message +="<h2> Principle Amount is "
				+ frm.txtP.value+"</h2>";
				
	message +="<h2> No. Of Years is "
				//+ frm[1].value+"</h2>";
				+ frm.txtN.value+"</h2>";
				
	message+="<h2> Rate Of Interest is "
				+ frm.txtR.value+"</h2>";			
	
	var p = parseFloat(frm.txtP.value);
	var n = parseInt(frm.txtN.value);
	var r = parseFloat(frm.txtR.value);
	var si =  p * n * r;

	message += '<h1>Simple Interest is '+si/100+"</h1>";
	
	win.document.write(message);
	}
}




