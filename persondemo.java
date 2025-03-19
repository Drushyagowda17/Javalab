
package classes;
import java.util.Scanner;
class person 
{
	String name;
	int age;
	
	 void readdetails()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the name and age:");
		 	name=sc.next();
		 	age=sc.nextInt();
		 	sc.nextLine();
	 }
}

	class student extends person
	{
		 int regno;
		 double n1,n2,n3,avg,total;
		 String result;
		 
		 public void getresults()
		 
		 {
			 java.util.Scanner sc = new Scanner(System.in);
			 System.out.print("Enter the name and age:");
			 regno=sc.nextInt();
			 n1=sc.nextDouble();
			 n2=sc.nextDouble();
			 n3=sc.nextDouble();
			 sc.nextLine();
		 }
		 
					
	 void calculation()
	 {
		 total=n1+n2+n3;
		 avg=total/3;
		 if(avg>80)
			 result="distinction";
		 if(avg>60)
			 result="Firstclass";
		 if(avg>=40)
			 result="pass";
		 if(avg<40)
			 result="fail";
		 
	 }
	  void Display() {
		  System.out.print("\t|" +name);
		  System.out.print("\t|" +age);
		  System.out.print("\t|" +regno);
		  System.out.print("\t|" +n1);
		  System.out.print("\t|" +n2);
		  System.out.print("\t|" +n3);
		  System.out.print("\t|" +avg);
		  System.out.print("\t|" +total);
		  System.out.print("\t|" +result);
		  
	  }
	  
	  
	   public class Persondemo{
		   public static void main (String[] args) {
			   Scanner sc = new Scanner(System.in);
			   student[] s=new student[20];
			   int n;
			   System.out.print("Enter the number of students:");
			   n=sc.nextInt();
			   for(int i=0;i<n;i++)
			   {
				   s[i]=new student();
			   		s[i].readdetails();
			   		s[i].getresults();
			   		s[i].calculation();
			   		
		        }
		   System.out.print("\t___________________________________________________________________________");
		   System.out.print("\t| name \t| age \t| regno\t| n1 \t| n2 \t| n3 \t| avg \t| total \t| result \t|");
		   System.out.print("\t___________________________________________________________________________");
		   
		   
		   for(int i=0;i<n;i++)
			   s[i].Display();
		   System.out.print("\t___________________________________________________________________________");
		   
	   }
	   }
	   }
	   
