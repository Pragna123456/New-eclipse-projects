package jdbcapplication;

public class ProductMain4 {

	public static void main(String[] args) {

		ProductDao dao = new ProductDao();
	    int count= dao.deleteProduct("drc");
	    System.out.println("ur scuessfully delete"+count);


}

}
