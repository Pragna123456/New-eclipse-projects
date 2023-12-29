package com.sathya;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.Base64;

public class Product {
private String proId;
private String proName;
private double proPrice;
private String proBand;
private String proMade;
private Date proMdate;
private Date proExdate;
private InputStream proImage;

private byte[] readImage;
public String getReadImage()
{
	return Base64.getEncoder().encodeToString(readImage);
	}
 public void setReadImage(byte[] readImage)
 {
	 this.readImage=readImage;
 }
 
public String getProId() {
	return proId;
}
public void setProId(String proId) {
	this.proId = proId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public double getProPrice() {
	return proPrice;
}
public void setProPrice(double proPrice) {
	this.proPrice = proPrice;
}
public String getProBand() {
	return proBand;
}
public void setProBand(String proBand) {
	this.proBand = proBand;
}
public String getProMade() {
	return proMade;
}
public void setProMade(String proMade) {
	this.proMade = proMade;
}
public Date getProMdate() {
	return proMdate;
}
public void setProMdate(Date proMdate) {
	this.proMdate = proMdate;
}
public Date getProExdate() {
	return proExdate;
}
public void setProExdate(Date proExdate) {
	this.proExdate = proExdate;
}
public InputStream getProImage() {
	return proImage;
}
public void setProImage(InputStream proImage) {
	this.proImage = proImage;
}


}
