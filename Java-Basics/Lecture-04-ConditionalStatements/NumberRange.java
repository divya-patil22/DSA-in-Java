
import java.util.Scanner;

public class NumberRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if (num >= 10 && num <= 50) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }
    }
}
