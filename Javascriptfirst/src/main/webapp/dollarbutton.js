function convertToDollar(){  
    //Read the fahrenheitInput store iin variable 
     const exchangerate = 88.35
	
	const dollarInput1 = document.getElementById("dollarInput").value;
	//convert the fahrenheitInput to celcius 
	const rupeeOutputNew = parseFloat(dollarInput1)*exchangerate;
	
	//Set the output to celsiusOutput filed 
	 document.getElementById("rupeeOutput").value = rupeeOutputNew.toFixed(2);
	}
	


