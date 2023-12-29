package jdbcapplication;

import java.util.List;

public class ProductMain7 {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		List<product> products = dao.findAll();
		products.forEach(product->System.out.println(product));
	}
}