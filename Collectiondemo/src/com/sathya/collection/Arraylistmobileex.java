package com.sathya.collection;




import java.util.List;

public class Arraylistmobileex {

	public static void main(String[] args) {
		List<Mobileex> m= List.of(
				new Mobileex("apple","white",888000.09),
				new Mobileex("apple..11","white",888000.09),
				new Mobileex("apple.sx","white",888000.09),
				new Mobileex("apple/15","white",888000.09),
				new Mobileex("apple..324","white",888000.09));
		
		for (Mobileex m1 : m) 
		{
			System.out.println(m1);
		}

	}

}
