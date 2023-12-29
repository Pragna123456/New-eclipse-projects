import java.util.ArrayList;

import com.sathya.productdetails.Product;

public class Arraylistproductsex {

	public static void main(String[] args)
	{
	   Product p1 = new Product();
	   p1.setpId(1001);
	   p1.setpName("santoor");
	   p1.setpPrice(28.09);
	   
	   Product p2 = new Product();
	   p2.setpId(1002);
	   p2.setpName("lux");
	   p2.setpPrice(50.09);
	   
	   Product p3 = new Product();
	   p3.setpId(1005);
	   p3.setpName("apple");
	   p3.setpPrice(105.09);
	   
	   
	   ArrayList<Product> pp= new ArrayList<Product>();
	   pp.add(p1);
	   pp.add(p2);
	   pp.add(p3);
	   
	   for (Product p : pp) 
	   {
	   System.out.println(p.getpId()+" "+p.getpName()+" "+
	   p.getpPrice());
	   
	   
	}

	   
	}

}
