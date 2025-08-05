// 1st Brute Fore Approch
package Basic_questions;
import java.util.Scanner;
public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of rows
        int count = 0; // Initialize count of digits
        while (n > 0) {
            n /= 10; // Remove the last digit
            count++; // Increment count
        }
        System.out.println(count); // Print the total count of digits
    }
}