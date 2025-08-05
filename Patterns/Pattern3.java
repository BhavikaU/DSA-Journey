package Patterns;
import java.util.Scanner;   
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows
        for (int i = 1; i <= n; i++) { // Outer loop for rows
            for (int j = 1; j <= i; j++) { // Inner loop for columns
                System.out.print(j + " " ); // Print number followed by space
            }
            System.out.println(); // Move to the next line after printing stars in a row
        }
    }
}
