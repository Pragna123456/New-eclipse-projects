package com.sathya.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {
		
	
   Map<Character,Integer> roman=new LinkedHashMap<Character,Integer>();
   roman.put('I', 1);
   roman.put('V', 5);
   roman.put('X', 10);
   roman.put('L', 50);
   roman.put('C', 100);
   roman.put('D', 500);
   roman.put('M', 1000);
   
   
Scanner s =  new Scanner(System.in);
   System.out.println("enter the roman number");
   String romannumber=s.next().toUpperCase();
   
   
int n=0;
   int preval=0;
   
   for (int i=romannumber.length()-1;i>=0;i--) 
   {
	  
	Integer currentval = roman.get(romannumber.charAt(i));
	   if(currentval<preval)
	   {
		   
		   n -=currentval;
		   
	   }
	   else
	   {
		   n +=currentval;
	   }
     preval=currentval;
}
   System.out.println("integer is"+n);
   s.close();

}
}