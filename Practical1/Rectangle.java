import java.util.*;
public class Rectangle
{
	public static void main(String a[])
	{
		float l,b,area;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of Rectanglev : ");
		l=sc.nextFloat();
		System.out.print("Enter Width of Rectanglev : ");
		b=sc.nextFloat();
		area=l*b;
		System.out.println("Area of "+ area);

	}
}