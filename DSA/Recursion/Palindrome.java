
public class Palindrome {

    static boolean palindrome(String str, int n, int i) {
        if (i >= n / 2) {
            return true;
        }

        char idx = str.charAt(i);
        char num = str.charAt(n - i - 1);
        if (idx != num) {
            return false;
        }
        return palindrome(str, n, i + 1);
    }

    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(palindrome(str, str.length(), 0));

    }
}
