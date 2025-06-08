/*   1. Batch Processing Practice Question:
# Scenario:
You want to update the price of multiple products at once.

# Task:
Write a JDBC program that:
1. Insert 3 products using batch processing.
2. Executes the batch and prints how many  were inserted successful.

# Table Structure:
CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    price Double(10, 2));
);    */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Batch{
    private static final String URL ="jdbc:postgresql://localhost:5432/basic";
    private static final String USER ="postgres";
   private static final String PASSWORD="ravi098";

    String sql = "INSERT INTO products (product_id, product_name) VALUES (?, ?)";

    public void addBatch(){

      try {
          Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
          PreparedStatement pst = con.prepareStatement(sql);
          Scanner sc = new Scanner(System.in);

          for (int i = 1; i <=3 ; i++) {
              System.out.println("Enter details for product: " + i);


              System.out.println("Enter Product ID: ");
              int product_id = sc.nextInt();
              sc.nextLine();
              System.out.println("Enter Name: ");
              String product_name = sc.nextLine();

              pst.setInt(1, product_id);
              pst.setString(2, product_name);
              pst.addBatch();
          }
       int[] result =   pst.executeBatch();
          System.out.println("\nBatch Insert Completed:");


      }catch (SQLException e){
          System.out.println(e.getMessage());
      }
   }


}

public class Batch_Processing {
    public static void main(String[] args) {

Batch batch = new Batch();
batch.addBatch();

    }
}
