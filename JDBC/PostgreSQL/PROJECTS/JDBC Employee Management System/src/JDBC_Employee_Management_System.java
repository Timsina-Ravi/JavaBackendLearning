/* JDBC Master Project: Employee Database Management (CRUD)

Task: Build a Java Console Application to manage an Employee database using JDBC (PostgreSQL).

Table Structure:

CREATE TABLE employees (
  id SERIAL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  department VARCHAR(50) NOT NULL,
  email VARCHAR(50) UNIQUE,
  salary INT NOT NULL
);


Functionalities:
1. Connect to PostgreSQL:
   - Load JDBC driver and use `DriverManager` for DB connection.
   - Create a utility class for managing DB connections.

2. Insert New Employee:
   - Use `PreparedStatement` to insert employee data (name, department, email, salary).

3. View All Employees:
   - Use `ResultSet` to retrieve and display all records.

4. Update Employee Email by ID:
   - Use `PreparedStatement` to update email by employee ID.

5. Delete Employee by ID:
   - Use `PreparedStatement` to delete employee by ID.
    */



import java.sql.*;
import java.util.Scanner;

class Employee {
    private static final String URL = "jdbc:postgresql://localhost:5432/EmployeeDetails";
    private static final String USER = "postgres";
    private static final String PASSWORD = "ravi098";
    Scanner sc = new Scanner(System.in);


    public void addDetails() {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            for (int i = 1; i <=3 ; i++) {


                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Department: ");
                String department = sc.nextLine();
                System.out.println("Enter Email: ");
                String email = sc.nextLine();
                System.out.println("Enter Salary");
                int salary = sc.nextInt();
                sc.nextLine();

                String InsertSQL = "insert into Employees(name,department,email,salary) values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(InsertSQL);
                pst.setString(1, name);
                pst.setString(2, department);
                pst.setString(3, email);
                pst.setInt(4, salary);
                pst.addBatch();
                pst.executeBatch();
                System.out.println("Inserted Successfully ");

                pst.close();
                con.close();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void viewDetails() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            String ReadSQL = "select * from Employees";
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery(ReadSQL);
            while (rst.next()) {
                String name = rst.getString("name");
                String department = rst.getString("department");
                String email = rst.getString("email");
                int salary = rst.getInt("salary");
                System.out.println("Name: " + name + " Department: " + department + " Email: " + email + " Salary: " + salary);
            }
            rst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateDetails() {
        try {
            String UpdateSQL = "update Employees set email = ? where id = ?";
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pst = con.prepareStatement(UpdateSQL);
            System.out.println("Enter newEmail: ");
            String newEmail = sc.nextLine();
            System.out.println("Enter ID to Update Email");
            int id = sc.nextInt();
            pst.setString(1, newEmail);
            pst.setInt(2, id);
            pst.executeUpdate();
            System.out.println("Updated Successfully ");

            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDetails() {
        try {
            String DeleteSQL = "delete from Employees where id = ?";
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement pst = con.prepareStatement(DeleteSQL);
            System.out.println("Enter ID to delete table");
            int id = sc.nextInt();
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Deleted Successfully ");

            pst.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


public class JDBC_Employee_Management_System {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("MENU: ");

            System.out.println("1. Add Employee Details: ");
            System.out.println("2. View Employee Details: ");
            System.out.println("3. Update Employee Details: ");
            System.out.println("4. Delete Employee Details: ");
            System.out.println("5. Exit From The Application  ");
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    employee.addDetails();
                    break;
                case 2:
                    employee.viewDetails();
                    break;
                case 3:
                    employee.updateDetails();
                    break;
                case 4:
                    employee.deleteDetails();
                    break;
                case 5:
                    System.out.println("Exiting.........");
                    loop = false;
                    break;
                default:
                    System.out.println("Enter a valid choice between 1 to 5");

            }
        }
    }
}