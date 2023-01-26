import java.util.Scanner;
public class prime
{
	public static void main(String[] args) {
		int i,n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the nuber to be cheack");
		 n=input.nextInt();
		 for(i=2;i<n/2;i++)
		 {
			 if(n%i==0) {
				 System.out.println(n+"is not prime");
				 break;
			 }}
				 if(i==n/2) 
					System.out.println(n+"is prime"); 
		     
		 }
		
		
	}
	


