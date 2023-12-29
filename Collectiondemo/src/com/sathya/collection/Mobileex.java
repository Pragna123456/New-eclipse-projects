package com.sathya.collection;

public class Mobileex {
	private String mName;
	private String mColor;
	private double mPrice;
 
	
	
	public Mobileex(String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
	public void mobile(String mName,String mColor, double mPrice)
	{
	 this.setmName(mName);
	 this.setmColor(mColor);
	 this.setmPrice(mPrice);
	 		 	
	}
	public double getmPrice() {
		return mPrice;
	}
	public void setmPrice(double mPrice) {
		this.mPrice = mPrice;
	}
	public String getmColor() {
		return mColor;
	}
	public void setmColor(String mColor) {
		this.mColor = mColor;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}

}




