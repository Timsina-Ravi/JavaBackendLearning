
// Take 5 integer inputs from user and store in an array.

import java.util.Scanner;

public class UserInputIntegerArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array of size 5: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length ; i++) {
        arr[i] = scanner.nextInt();
        }
        System.out.println("You Entered:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        scanner.close();


    }
}