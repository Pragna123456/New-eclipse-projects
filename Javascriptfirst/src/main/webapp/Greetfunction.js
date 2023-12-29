function greet(){
	document.write("good mong ratan sir <br>");
}

function add(num1,num2)
{
	let res;
	res = num1+num2;
		document.write("addition of 2 numbers"+res+"<br>");

}
function billCal(id,name,quantity,price)
{
	let totalbill;
	totalbill=price*quantity;
	return totalbill;
}
function dummy(){
	}


//calling the function
greet();
add(20,30);
let bill =billCal(101,"sugar",24,2466);
		document.write("total bill is.."+bill+"<br>");
		
let res =dummy();
		document.write("dummy is.."+res+"<br>");


		

