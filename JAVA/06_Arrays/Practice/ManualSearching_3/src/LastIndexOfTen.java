//Find the index of last occurrence of 10.

public class LastIndexOfTen {
    public static void main(String[] args) {

        /*  option 1
        int[] arr = {2, 4, 5, 10, 24, 45, 10, 234};
        int target = 10;
        int lastIndex=-1;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                lastIndex =i;
            }
        }

            if (lastIndex > -1) {
                System.out.println("last occurence of 10 is at index:" + lastIndex);
            }else {
                System.out.println("10 has not occured ia an array");


        }

         */

        // option 2

        int[] arr = {2, 4, 5, 10, 24, 45, 10, 234};
        int target = 10;
        boolean isFound = false;

        for (int i = arr.length-1; i >= 0; i--) {
            if (target == arr[i]) {
                System.out.println("10 is occured at last index: " + i);
                isFound = true;
                break;

            }
        }
        if (!isFound){
            System.out.println("10 is not occured ia an array ");
        }
    }
}

