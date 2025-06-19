//Find the index of first occurrence of 10.

public class FirstIndexOfTen {
    public static void main(String[] args) {

        int arr[] = {1,2,34,5,6,10,34,10,23};
        int target = 10;
       boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("10 is occured at index" + i);

                isFound = true;
                break;

            }
        }
        if (!isFound) {
            System.out.println(target + " not found in the array.");
        }
    }
}
