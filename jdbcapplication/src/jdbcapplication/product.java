package jdbcapplication;

public class product 
{
   private String proId;
   private String proName;
   private double proPrice;
   
public String getProId() {
	return proId;
}
@Override
public String toString() {
	return "product [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
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
	
}


