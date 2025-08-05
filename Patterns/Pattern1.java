package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows 
       // int n ; // Number of rows
        for (int i = 1; i <= n; i++) // This is the outer loop which will loop for the rows.
        {
            for (int j = 1; j <= n; j++)  /// This is the inner loop which here, loops for the columns
            {
                System.out.print("* ");
            }
            System.out.println();  /// As soon as N stars are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        }
    }
    
}
