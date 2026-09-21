
public class Print1toN {

    static void print1toN(int n, int i) {

        if (i > n) {

            return;
        } else {
            System.out.println(i);
            print1toN(n, i + 1);
        }

    }

    public static void main(String[] args) {

        print1toN(5, 1);
    }
}
