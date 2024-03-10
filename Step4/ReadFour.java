package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
            try{
                int sum =0;
                Scanner sc = new Scanner(new File("/Users/diksha/Desktop/Projects/FileIOJava/Step4/input.txt"));
                while(sc.hasNext()){
                    int LineIn = sc.nextInt();
                    sum = sum+LineIn;
                    System.out.println("Running Total: "+sum);
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}