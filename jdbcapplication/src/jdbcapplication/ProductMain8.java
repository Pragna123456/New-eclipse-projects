package jdbcapplication;

public class ProductMain8 {
public static void main(String[] args) { 
				ProductDao dao = new ProductDao();
				int count = dao.droptable();
				System.out.println("Table is dropped status...."+count);
			}
		}