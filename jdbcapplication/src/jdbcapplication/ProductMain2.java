package jdbcapplication;

public class ProductMain2 {

	public static void main(String[] args) {
  ProductDao dao  =new ProductDao();
  product product =dao .finallyId("vcd");
  if(product!=null)
  {
	System.out.println("product availble");
	System.out.println(product.getProId()+" "+product.getProName()+" "+product.getProPrice());  
  }
  else
  {
	  System.out.println("product not availble");
  }
	}
}
