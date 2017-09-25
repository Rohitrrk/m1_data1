/*Function to calculate cost of service*/
function calculateBill(frm) {
	if(frm.checkValidity())
	{
        var title = document.getElementById("ddlTitle").value;
        var name = document.getElementById("txtName").value;
		var carType = document.getElementById("ddlCarType").value;
		var cost = document.getElementById("txtCost").value;
		var freeService = document.getElementById("chkFS");
		var bodyRepair = document.getElementById("chkBR");
		var serviceCost;
        /*Check car type is ALL*/
		if(freeService.checked && bodyRepair.checked)
		{
			alert("Choose only one servicetype");
		}
        else if (freeService.checked) {
			if((carType == "HatchBack" || carType == "SmallCar" || carType == "Sedan"))
				serviceCost = 200;	

		 displayBill(title,name,serviceCost);
         }
		/* Check bodyRepair is checked */
        else if(bodyRepair.checked)
		{
			/* Check car type is HATCHBACK */
			if (carType == 'HatchBack' ) 
            serviceCost = 0.15 * parseFloat(cost);
        
			/* Check car type is smallcar */
			else if (x == 'SmallCar')
            serviceCost = 0.10 * parseFloat(cost);
			
			/* Check car type is Sedan */
			else
            serviceCost = 0.18 * parseFloat(cost);
		
		displayBill(title,name,serviceCost);
        }
		else
		{
			alert('Plz choose type of service...');	
		}
	}
}
	
	function displayBill(title,name,serviceCost)
	{
		alert('Thanks for your Visit ' + title + '.'+name + '. Your Final bill is ' + serviceCost);
	}
