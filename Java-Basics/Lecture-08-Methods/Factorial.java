
public class Factorial {

    static int factorial(int n) {

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;

    }

    public static void main(String[] args) {

        int fact = factorial(5);
        System.out.println("Factorial: " + fact);
    }
}
