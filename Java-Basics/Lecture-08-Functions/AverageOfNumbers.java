
import java.util.Scanner;

public class AverageOfNumbers {
      public static float average(float a, float b, float c){
              float avg = a+b+c/3;
              return avg;
      }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter three numbers to calculate their average: ");
         float a = sc.nextInt();
         float b = sc.nextInt();
         float c = sc.nextInt();
         System.out.println("Average: "+average(a,b,c));
     }         
}
