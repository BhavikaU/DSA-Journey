package Basic_questions;
public class Reverse_Number {
    public static void main(String[] args) {
        int n = 12345;
        int revnum = 0;
        while(n > 0)
        {
            int ld = n % 10;
            revnum = (revnum * 10) + ld;
            n = n / 10;
        }
        System.out.print(revnum);
    }
}