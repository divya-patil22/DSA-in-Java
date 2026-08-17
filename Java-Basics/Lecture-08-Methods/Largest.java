
public class Largest {

    static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int large = largest(10, 25, 20);
        System.out.println("Largest: " + large);
    }
}
