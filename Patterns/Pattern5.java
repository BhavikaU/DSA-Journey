package Patterns;
import java.util.Scanner;   
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = n; j >= i; j--) { // Inner loop for columns
                System.out.print("* "); // Print star followed by space
            }
            System.out.println(); // Move to the next line after printing stars in a row
        }
    }
}
