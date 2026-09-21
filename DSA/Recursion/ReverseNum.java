
public class ReverseNum {
     static int reverseNum(int n,int rev) {
        
         if(n==0){
              return rev;
         }else{
              int digit = n%10;
     rev = rev*10+digit;
     return reverseNum(n/10, rev);
         }
         
     }
    public static void main(String[] args) {
    System.out.println(reverseNum(1234,0));
    }
}
