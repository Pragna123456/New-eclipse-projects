package jdbcapplication;
public class ProductMain5 {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		    int count= dao.deleteProductByPrice(200);
		    System.out.println("ur scuessfully deleted"+count);

	}
	}
	


