import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Transaction {
    private static final String URL = "jdbc:postgresql://localhost:5432/basic";
    private static final String USER = "postgres";
    private static final String PASSWORD = "ravi098";

    // SQL query without the price as it will be set by default in the database
    String sql = "INSERT INTO products (product_id, product_name) VALUES (?, ?)";

    public void addTransaction() {
        Connection con1 = null;  // Declare outside the try block to use in both try and catch
        PreparedStatement pst1 = null;  // Declare PreparedStatement outside the try block

        try (Scanner sc = new Scanner(System.in)) {
            // Establish connection
            con1 = DriverManager.getConnection(URL, USER, PASSWORD);
            con1.setAutoCommit(false); // Start transaction

            // Prepare SQL statement
            pst1 = con1.prepareStatement(sql);

            // Loop to get product details from the user
            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter details for product " + i + ":");

                System.out.print("Product ID: ");
                int product_id = sc.nextInt();
                sc.nextLine(); // clear buffer

                System.out.print("Product Name: ");
                String product_name = sc.nextLine();

                // Set values for the prepared statement
                pst1.setInt(1, product_id); // Set Product ID
                pst1.setString(2, product_name); // Set Product Name

                // Add the statement to batch
                pst1.addBatch();
            }

            // Execute the batch
            int[] result = pst1.executeBatch();

            // Commit transaction if all insertions are successful
            con1.commit();

            System.out.println("\nBatch Insert Completed:");
            for (int i = 0; i < result.length; i++) {
                System.out.println("Insert " + (i + 1) + ": " + result[i] + " row(s) inserted");
            }

        } catch (SQLException e) {
            // Handle error and perform rollback if exception occurs
            System.out.println("Error: " + e.getMessage());
            if (con1 != null) {
                try {
                    con1.rollback(); // Rollback the transaction using con1
                    System.out.println("Transaction rolled back.");
                } catch (SQLException rollbackException) {
                    System.out.println("Error during rollback: " + rollbackException.getMessage());
                }
            }
        } finally {
            // Always close resources
            try {
                if (pst1 != null) pst1.close();
                if (con1 != null) con1.close(); // Close the connection
            } catch (SQLException e) {
                System.out.println("Error during closing resources: " + e.getMessage());
            }
        }
    }
}

public class Transaction_Handling {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.addTransaction();
    }
}
