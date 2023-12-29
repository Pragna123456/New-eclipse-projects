package jdbcapplication;

public class ProductMain1 {

	public static void main(String[] args) 
	{
		ProductDao dao = new ProductDao();
		product p1 =new product();
		p1.setProId("vcd");
		p1.setProName("knife");
		p1.setProPrice(25856.8);
		
		int result = dao.saveProduct(p1);
		if(result==1)
		{
			System.out.println("data inserted scuessfully"+result);
			
		}
		else {
			System.out.println("data inserted failed"+result);

		}
		
	}
}
		
		
		
		
		
	


