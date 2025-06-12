//Loop through an int[] using for-each and print sum of elements.

public class IntArraySumForEach {
    public static void main(String[] args) {

        int[] arr = {23,24,56,23,45,46};
        int sum =0;
        for (int i : arr){
            sum=sum+i;
        }
        System.out.println("Sum of elements is: " + sum);

    }
}
