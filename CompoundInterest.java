package Java;
import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values:");
        double P = sc.nextDouble(), r = sc.nextDouble(), n = sc.nextDouble(), t = sc.nextDouble();  
        System.out.println(P * Math.pow(1 + r / n, n * t));  
    }
}