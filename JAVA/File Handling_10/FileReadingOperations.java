
//
//File Reading Operations:
//
//        1.
//Write a program that performs the following tasks:
//Create a file named data.txt with some sample text (e.g., a few lines of text).
//Read the contents of the file using FileReader and print the contents to the console.

//Modify the program to read the same file using BufferedReader.
//Compare the ease of use and performance between FileReader and BufferedReader.
//Count and print the number of lines in the file using BufferedReader.
//

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadingOperations{
public static void main(String[] args) throws Exception{

    File file = new File("File.txt");
    file.createNewFile();

    FileWriter fileWriter = new FileWriter(file);
    fileWriter.write("This is the first line.\n");
    fileWriter.write("This is the second line.\n");
    fileWriter.write("This is the third line.\n");
    fileWriter.write("This is the fourth line.\n");
    fileWriter.close();


    System.out.println("Reading using FileReader:");
    FileReader fileReader = new FileReader(file) ;
    int character;
    while ((character = fileReader.read()) !=-1){
        System.out.println((char) character);
    }
    fileReader.close();

    System.out.println("\nReading using BufferedReader:");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file)) ;
        String line;
        int linecount = 0;
      while ((line = bufferedReader.readLine())!= null){
          System.out.println(line);
          linecount++;
    }
    bufferedReader.close();


System.out.println("Total number of lines is " + linecount);



}
}
