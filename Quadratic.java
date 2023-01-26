import java.util.Scanner;
public class Quadratic{
	public static void main(String[] Strings)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the value of a");
		double a=input.nextDouble();
		System.out.println("enter the value of b");
		double b=input.nextDouble();
		System.out.println("enter the value of c");
		double c=input.nextDouble();
		double d=b*b-4*a*c;
		if(d>0.0)
		{
			double r1=(-b+Math.sqrt(d))/(2*a);
			double r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("the roots are real and distinct\n root1="+r1+"\nroot2="+r2);	
		}
		else if(d==0)
		{
			double r1=-b/2*a;
			double r2=-b/2*a;
			System.out.println("the roots are real and equal\n root1="+r1+"\nroot2="+r2);	   	
		}
		else
		{
			System.out.println("the roots are different and complex");
		}
	}
	
}
