package etc.November.november12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String inputTxtFile = "November/november12/input.txt";
        String outputTxtFile = "November/november12/output.txt";
        Scanner scan = new Scanner(new File(inputTxtFile));
        PrintStream out = new PrintStream(new File(outputTxtFile));


        // Create a 2D array to store the input data
        int[][] array = new int[5][5];

        // Read data from the input file into the 2D array
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = scan.nextInt();
            }
        }

        // Find the maximum K
        int maxK = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[i][j] > maxK) {
                    maxK = array[i][j];
                }
            }
        }

        // Write the result to the output file
        out.println(maxK);

    }

}
