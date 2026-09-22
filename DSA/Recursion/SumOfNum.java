
public class SumOfNum {

    static int sumOfNum(int n, int sum) {
              //Parameterised way
        if (n < 1) {
            System.out.println(sum);
            return 0;
        } else {
            return sumOfNum(n - 1, sum + n);
        }
    }

    public static void main(String[] args) {
        sumOfNum(4, 0);
    }
}
