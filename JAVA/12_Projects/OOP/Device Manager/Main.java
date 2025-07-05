import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item device = null;  // Polymorphism (Item reference to Device object)

        while (true) {
            System.out.println("1.Create 2.View 3.Update 4.Delete 5.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();  

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();  

                    System.out.print("Enter model: ");
                    String model = sc.nextLine();

                    device = new Device(name, price, model);  // Inheritance + Polymorphism
                    break;

                case 2:
                    if (device != null)
                        device.display();  // Polymorphism (calls Device's display)
                    else
                        System.out.println("No device to display.");
                    break;

                case 3:
                    if (device != null) {
                        Device d = (Device) device;  // Downcast to access setters
                        System.out.print("Enter new name: ");
                        d.setName(sc.nextLine());   

                        System.out.print("Enter new price: ");
                        double newPrice = sc.nextDouble();
                        sc.nextLine();
                        d.setPrice(newPrice);       

                        System.out.print("Enter new model: ");
                        d.setModel(sc.nextLine());  

                    } else {
                        System.out.println("No device to update.");
                    }
                    break;

                case 4:
                    device = null;                 // Deleting the object reference
                    System.out.println("Device deleted.");
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println();
        }
    }
}

