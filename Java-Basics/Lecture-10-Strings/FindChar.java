
import java.util.Scanner;

public class FindChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char target = 'e';
        Boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                found = true;
                break;
            }
        }
            if (found) {
                System.out.println("Present");
            } else {

                System.out.println("Not present");

            }
        
    }
}
