
import java.util.Scanner;
public class CircleArea {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter Radius: ");
int radius = sc.nextInt();
final double PI = 3.14;
double area = PI*radius*radius;
System.out.println("Area of "+radius+" is "+area);
}     
}
