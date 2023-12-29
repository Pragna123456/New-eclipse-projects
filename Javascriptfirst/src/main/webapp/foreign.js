function convertToFahrenheit()
{	 //Read the fahrenheitInput store iin variable 
     const fahrenheitInput  = document.getElementById('fahrenheitInput').value;
	
	//convert the fahrenheitInput to celcius
	const celsiusTemperature = (parseFloat(fahrenheitInput) - 32) * 5/9;
	
	//Set the output to celsiusOutput filed
	document.getElementById('celsiusOutput').value = celsiusTemperature.toFixed(2);
}