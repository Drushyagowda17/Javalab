package Java;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt(), sum = 0;  
        for (int i = 0; i < n; i++)
        	sum += sc.nextInt();  
        System.out.println(sum / (double) n);  
    }
}