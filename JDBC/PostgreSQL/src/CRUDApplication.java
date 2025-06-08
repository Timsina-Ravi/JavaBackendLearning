import java.sql.*;
import java.util.Scanner;

class CRUD {
    private static final String URL = "jdbc:postgresql://localhost:5432/basic";
    private static final String USER = "postgres";
    private static final String PASSWORD = "ravi098";

    public void add() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Your Email: ");
            String email = sc.nextLine();
            String sql = "insert into crud (name,email) values(?,?)";
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
            String sql = "select * from crud";
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("Name is :" + name + " Email is: " + email);
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
            System.out.println("Enter  newName: ");
            String newName = sc.nextLine();
            String sql = "update crud set name =? where email = ?";
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
            System.out.println("ENter email to delete: ");
            String email = sc.nextLine();
            String sql = "delete from crud where email = ?";
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

    public class CRUDApplication {
        public static void main(String[] args) {
            CRUD crud = new CRUD();
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                System.out.println("MENU: ");
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println("1. ADD Details");
                System.out.println("2. View Details");
                System.out.println("3. Update Details");
                System.out.println("4. Delete Details");
                System.out.println("5. EXit");
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println("Enter Your Choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        crud.add();
                        break;
                    case 2:
                        crud.view();
                        break;
                    case 3:
                        crud.update();
                        break;
                    case 4:
                        crud.delete();
                        break;
                    case 5:
                        System.out.println("Exiting.............");
                        running=false;
                        break;
                    default:
                        System.out.println("Enter a valid number between 1 to 4");
                }
            }
        }
    }


