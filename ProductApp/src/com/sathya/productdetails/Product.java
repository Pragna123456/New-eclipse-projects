package com.sathya.productdetails;

public class Product {
	private int pId;
	private String pName;
	private double pPrice;
	
	public 
	Product (int pId,String pName,double pPrice ) {
		this.pId = pId;
		this.pName=pName;
		this.pPrice=pPrice;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	

}
