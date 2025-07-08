import java.sql.*;
import java.util.Scanner;


    class CRUD {
        // Use MySQL JDBC connection URL
        private static final String URL = "jdbc:mysql://localhost:3306/JDBC"; // After / keep your DB name
        private static final String USER = "mysql";                 // Your MySQL username
        private static final String PASSWORD = "ravi098";    // Your MySQL password

        public void add() {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Your Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Your Email: ");
                String email = sc.nextLine();
                String sql = "INSERT INTO crud (name, email) VALUES (?, ?)";
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, email);
                pst.executeUpdate();
                System.out.println("Inserted");
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        public void view() {
            try {
                String sql = "SELECT * FROM crud";
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    System.out.println("Name is: " + name + " Email is: " + email);
                }
                rs.close();
                st.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void update() {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter email to change name: ");
                String email = sc.nextLine();
                System.out.println("Enter new name: ");
                String newName = sc.nextLine();
                String sql = "UPDATE crud SET name = ? WHERE email = ?";
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, newName);
                pst.setString(2, email);
                pst.executeUpdate();
                System.out.println("Updated");
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        public void delete() {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter email to delete: ");
                String email = sc.nextLine();
                String sql = "DELETE FROM crud WHERE email = ?";
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, email);
                pst.executeUpdate();
                System.out.println("Deleted");
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }


