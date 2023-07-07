package Step4;

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
            try {

                Scanner fileIn = new Scanner(new File("/Users/liz/LoPro/FileIOJava/Step4/input.txt"));

                int sum = 0;
                while (fileIn.hasNext()) {
                    sum += Integer.parseInt(fileIn.nextLine());
                    System.out.println("Running Total = "+sum);
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}