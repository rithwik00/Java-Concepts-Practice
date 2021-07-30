import java.util.*;

public class MultiDim {
    public static void main(String[] args) {

        //////////////////////////////////////////////////
        // Declaring 2-D array with 2 rows
        int arr[][] = new int[2][];
 
        // Making the above array Jagged
 
        // First row has 3 columns
        arr[0] = new int[3];
 
        // Second row has 2 columns
        arr[1] = new int[2];
 
        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
 
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        ////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);

        int totalTestCases = scanner.nextInt();
        int eachTestCaseValues;

        int[][] arrayMain = new int[totalTestCases][];

        for (int i = 0; i <= arrayMain.length; i++) {
            eachTestCaseValues = scanner.nextInt();
            arrayMain[i] = new int[eachTestCaseValues];

            for(int j = 0; j < arrayMain[i].length; i++)
                arrayMain[i][j] = scanner.nextInt();
        }

        for (int i = 0; i < arrayMain.length; i++) {

            int nEvenNumbers = 0, nOddNumbers = 0;

            System.out.println("TestCase " + i + " with " + arrayMain[i].length + " values:");

            for (int j = 0; j < arrayMain[i].length; j++) {
                System.out.print(arrayMain[i][j] + " ");
  
                if (arrayMain[i][j] % 2 == 0) 
                    nEvenNumbers++;  
                else 
                    nOddNumbers++;
            }

            System.out.println();
  
            System.out.println("Total Even numbers: " + nEvenNumbers + ", Total Odd numbers: " + nOddNumbers);
            scanner.close();
        }
    }   
}

/* input 
2
2
1 2
3
1 2 3
*/
