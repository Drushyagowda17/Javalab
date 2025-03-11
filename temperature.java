package Java;
import java.util.Scanner;
public class Temperature {
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value and F or C");
        double temp = sc.nextDouble();  
        String unit = sc.next();  
        System.out.println(unit.equals("C") ? (temp * 9 / 5 + 32) : ((temp - 32) * 5 / 9));  
    }
}