
//Part 1: Basic File Operations
//1. File Creation and Checking:
//        - Q1: Write a program to create a new file named `example.txt` in the current directory.
//        - Q2: After creating the file, check if the file exists. If it does, print its name, size,
//        and absolute path.
//
//2. File Deletion:
//        - Q3: Modify the above program to delete the file `example.txt` and confirm whether
//        it was deleted successfully.



import java.io.File;

public class BasicFileOperations {
    public static void main(String[] args)throws Exception {

        // 1
        //  Making an Object For File
        File file = new File("example.txt");
        // Creating a File
        file.createNewFile();
        // Check if a file exist or not
       System.out.println( file.exists());
       //FileName
       System.out.println(file.getName());
       //  absolute path
       System.out.println(file.getAbsolutePath());
       //Size
       System.out.println(file.length());

                //2

      System.out.println("File deleted: " + file.delete());
        System.out.println(file.exists());
    }
}
