package com.sathya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ProductDao {
	public int saveProduct(Product product) {  
        int result = 0;
        
        try (Connection connection = Dataconnection.createConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into product1 values(?,?,?,?,?,?,?,?)");
                    
        preparedStatement.setString(1, product.getProId());
		preparedStatement.setString(2, product.getProName());
		preparedStatement.setDouble(3, product.getProPrice());
		preparedStatement.setString(4, product.getProBand());
		preparedStatement.setString(5, product.getProMade());

		preparedStatement.setDate(6, product.getProMdate());
		preparedStatement.setDate(7, product.getProExdate());

		preparedStatement.setBinaryStream(8,product.getProImage());
		
		result=preparedStatement.executeUpdate();
		
	}
        catch (SQLException e) {
            e.printStackTrace();
	}

		return result;
		}

	
	
	
	public List<Product> findAll() {
	    List<Product> productslist = new ArrayList<Product>();
	    try (Connection connection = Dataconnection.createConnection(); 
	        // create the statement object
	        Statement statement = connection.createStatement();)
	    		{
	        // execute the query
	        ResultSet resultSet = statement.executeQuery("select * from product1");

	        while (resultSet.next()) {
	         Product product=new Product();
	         product.setProId(resultSet.getString("ProId"));
	         product.setProName(resultSet.getString("ProName"));
	         
	         product.setProPrice(Double.parseDouble(resultSet.getString("proPrice")));
	         product.setProBand(resultSet.getString("proBand"));
	         
			  product.setProMade(resultSet.getString("proMade"));
			  product.setProMdate(resultSet.getDate("proMdate"));
			  
			  product.setProExdate(resultSet.getDate("proExdate"));
			  
			  product.setProImage(resultSet.getBinaryStream("proImage"));
			  
			  product.setReadImage(resultSet.getBytes("proImage"));
			  productslist.add(product);
	  
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return productslist;
	}




	public int deleteById(String proId) {
       
		int result=0;
	    try (Connection connection = Dataconnection.createConnection())
	    		{
		
		PreparedStatement preparedStatement = connection.prepareStatement("delete from product1 where proId=?");
		preparedStatement.setString(1, proId);
		result = preparedStatement.executeUpdate();
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return result;
	}




	public Product editById(String proId) {
		Product product=null;
		  try (Connection connection = Dataconnection.createConnection(); )
			      
				  {// create the statement object
					PreparedStatement preparedStatement = connection.prepareStatement("select * from product1 where proId=?");
			    		
			        // execute the query
					preparedStatement.setString(1, proId);
			ResultSet resultSet = preparedStatement.executeQuery();


						if(resultSet.next())
						{
							product=new Product();
			         product.setProId(resultSet.getString("proId"));
			         product.setProName(resultSet.getString("ProName"));
			         
			         product.setProPrice(Double.parseDouble(resultSet.getString("proPrice")));
			         product.setProBand(resultSet.getString("proBand"));
			         
					  product.setProMade(resultSet.getString("proMade"));
					  product.setProMdate(resultSet.getDate("proMdate"));
					  
					  product.setProExdate(resultSet.getDate("proExdate"));
					  
					  product.setProImage(resultSet.getBinaryStream("proImage"));
					  
					  product.setReadImage(resultSet.getBytes("proImage"));
			  
			        }
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
			    return product;

	}


public int updateProduct(Product updatedProduct) {
	    int result = 0;
    try(Connection connection = Dataconnection.createConnection())
    {
    	int parameterIndex = 1;
         // SQL query to update product details
    	 String sql = "UPDATE product1 SET proName=?, proPrice=?, proBand=?, proMade=?, " +
                 "proMdate=?, proExdate=?" +
                 (updatedProduct.getProImage() != null ? ", proImage=?" : "") +
                 " WHERE proId=?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // Set the parameters for the update statement
        preparedStatement.setString(parameterIndex++, updatedProduct.getProName());
        preparedStatement.setDouble(parameterIndex++, updatedProduct.getProPrice());
        preparedStatement.setString(parameterIndex++, updatedProduct.getProBand());
        preparedStatement.setString(parameterIndex++, updatedProduct.getProMade());
        preparedStatement.setDate(parameterIndex++, updatedProduct.getProMdate());
        preparedStatement.setDate(parameterIndex++, updatedProduct.getProExdate());
        
        if ( updatedProduct.getProImage() != null) {
            preparedStatement.setBinaryStream(parameterIndex++, updatedProduct.getProImage());
        }
        
        preparedStatement.setString(parameterIndex++, updatedProduct.getProId());

            // Execute the update
            result = preparedStatement.executeUpdate();
        }
     catch (SQLException e) {
        e.printStackTrace();
    } 
    return result;
	    }
}
