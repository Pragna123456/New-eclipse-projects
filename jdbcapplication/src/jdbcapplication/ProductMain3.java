package jdbcapplication;

public class ProductMain3 {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		    int count= dao.updateProduct(200, 10);
		    System.out.println("ur scuessfully updated"+count);


	}

}
