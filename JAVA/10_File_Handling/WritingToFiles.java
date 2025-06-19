//part 3 :Writing to Files:
//
// Write a program to demonstrate writing to files using FileWriter, BufferedWriter, and PrintWriter.
//
//Perform the following tasks:
//        1. Create a file named `output.txt` and write the following content using FileWriter:
//Hello, World!
//Welcome to Java File Handling.


//2. Modify the program to write the same content to `output.txt` using BufferedWriter.

// 3. Appending Data to Files:
////         Write a program to append the following text to an existing file `output.txt` without overwriting its content:
//
////This is an additional line.





import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class WritingToFiles {
    public static void main(String[] args) throws Exception {

        File file = new File("Output.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        fw.write(" 1. Hello, World!\n" + "Welcome to Java File Handling.\n");
        fw.close();

// to append we have to write true in objects constructor
        BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
        bw.write("2. Hello, World!\n" + "Welcome to Java File Handling.\n");
        bw.write("This is an additional line.");


        bw.close();


    }
}
