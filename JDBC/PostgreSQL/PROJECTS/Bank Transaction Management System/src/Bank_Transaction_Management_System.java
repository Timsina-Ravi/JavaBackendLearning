/*Bank Transaction Management System (JDBC)

        Task: Create a Java Console Application to manage bank transactions using JDBC (PostgreSQL).

        Table Structure:

CREATE TABLE transactions (
        transaction_id SERIAL PRIMARY KEY,
        account_id INT NOT NULL,
        amount DECIMAL(10, 2) NOT NULL,
transaction_type VARCHAR(50) NOT NULL,
transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


        Functionalities:
        1. Batch Insert: Insert multiple transactions using `PreparedStatement` and batch processing for performance.
        2. Transaction Handling: Implement transaction handling with `commit()` and `rollback()` for data consistency.
        3. View Transactions: Retrieve and display all transaction records using `ResultSet`.
        4. Error Handling: Handle errors during batch processing to ensure smooth execution.

Features:
        - Efficient batch processing for large transaction volumes.
        - Ensures data consistency with transaction management.
        - Console interface for managing transactions.

        */







import java.sql.*;
import java.util.Scanner;


class Bank {
    private static final String URL = "jdbc:postgresql://localhost:5432/EmployeeDetails";
    private static final String USER = "postgres";
    private static final String PASSWORD = "ravi098";
    Scanner sc = new Scanner(System.in);


    public void addTransactions()  {
        try {
            String sql = "insert into transactions (account_id,amount,transaction_type) values(?,?,?)";
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pst = con.prepareStatement(sql);
            con.setAutoCommit(false);
            try {
                System.out.print("Enter number of transactions to insert: ");
                int count = sc.nextInt();
                for (int i = 0; i < count; i++) {


                    System.out.println("Enter Account ID: ");
                    int account_id = sc.nextInt();
                    System.out.println("Enter Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter TRansaction Type i.e (Withdraw & Deposit )");
                    String transaction_type = sc.nextLine();
                    pst.setInt(1, account_id);
                    pst.setDouble(2, amount);
                    pst.setString(3, transaction_type);
                    pst.addBatch();

                }
                pst.executeBatch();
                con.commit();
                    System.out.println("Successfully Inserted ");

                }catch(SQLException e1){
                    con.rollback();
                System.out.println("Insertion failed! Try again..");
                e1.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

public void viewTransactions(){
        try {
            String sql ="select * from transactions";
            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery(sql);
            while (rst.next()){
             int transaction_id =   rst.getInt("transaction_id");
             int id =   rst.getInt("account_id");
                Double amount =rst.getDouble("amount");
                String type =rst.getString("transaction_type");
                String date = String.valueOf(rst.getDate("transaction_date"));

                System.out.println("Transaction ID: " +transaction_id +" Account ID: " + id + " Amount: " +
                        amount + " Transaction Type: "+ type + "Transaction Date: "+ date );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        }







    }

public class Bank_Transaction_Management_System {
    public static void main(String[] args) {
            Bank bank = new Bank();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n1. Add Transactions");
                System.out.println("2. View All Transactions");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        bank.addTransactions();
                        break;
                    case 2:
                        bank.viewTransactions();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            }




    }
}