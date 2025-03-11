package Java;
import java.util.Scanner;
public class QuadraticRoots {
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("enter the values:");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();  
        double d = Math.sqrt(b * b - 4 * a * c);  
        System.out.println((-b + d) / (2 * a) + " " + (-b - d) / (2 * a));  
    }
}