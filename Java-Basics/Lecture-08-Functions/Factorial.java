
import java.util.Scanner;


public class Factorial {

    static int factorial(int n) {
        int factorial = 1;
         if(n < 0){
            System.out.println("Invalid Number!");
         }else{
            
        for (int i = n; i >=  1; i--) {
            factorial = factorial * i;
        }
        
         }
        return factorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial: " + fact);
    }
}
