import java.util.Scanner;
class Sum
{
	public void sum()
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number1");
		x=s.nextInt();
		System.out.print("Enter Number2");
		y=s.nextInt();
		System.out.print("Sum =");
		System.out.println(x+y);
	}
	public int sum(int n1,int n2)
	{
		return n1+n2;
	}
	public int sum(int n1)
	{
			return n1+10;
	}
	public double sum(double n1,double n2)
	{
			return n1+n2;
	}
	public float sum(float n1,float n2)
	{
				return n1+n2;
	}
}
public class Calc
{
	public static void main(String a[])
	{
		Sum s1=new Sum();
		s1.sum();
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number1");
		x=s.nextInt();
		System.out.print("Enter Number2");
		y=s.nextInt();
		System.out.println("Sum = "+s1.sum(x,y));
		double x1,y1;
		System.out.print("Enter Number1");
		x1=s.nextDouble();
		System.out.print("Enter Number2");
		y1=s.nextDouble();
		System.out.println("Sum = "+s1.sum(x1,y1));
		float x2,y2;
		System.out.print("Enter Number1");
		x2=s.nextFloat();
		System.out.print("Enter Number2");
		y2=s.nextFloat();
		System.out.println("Sum = "+s1.sum(x2,y2));
		System.out.print("Enter Number1");
		x=s.nextInt();
		System.out.println("Sum = "+s1.sum(x));


	}
}
