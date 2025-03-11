package Java;
import java.util.Scanner;  
public class PrimeChecker {
	 public static void main(String[] args) {  
	        Scanner sc = new Scanner(System.in);  
	        System.out.print("Enter the number:");
	        int n = sc.nextInt();
	        int i, flag = 0;  
	        for (i = 2; i <= n / 2; i++)  
	            if (n % i == 0)
	            { 
	              flag = 1;
	              break;
	            }  
	        System.out.println(flag == 0 ? "Prime" : "Not Prime");  
	    }  
}