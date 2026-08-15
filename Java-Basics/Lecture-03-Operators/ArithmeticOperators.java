import java.util.Scanner;
public class ArithmeticOperators {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
       System.out.println("Enter two number to check which is greater: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>b){
        System.out.println("The number "+a+" is greater.");
    }else{
        System.out.println("The number "+b+" is greater.");
    }
 
 System.out.println("Enter your age for voting: ");
int age = sc.nextInt();
if(age>=18){
    System.out.println("Your are eligible.");
}else{
    System.out.println("Your are  not eligible.");
}           
}
}
