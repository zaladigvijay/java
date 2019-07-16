import java.util.Scanner;
class Circle
{

			float r;
			final static double PI=3.14;

		Circle(float r)
		{
			this.r=r;
		}
		public double area()
		{
			return PI * r * r;
		}
}
class Triangle
{

			float h,b;

		Triangle(float h,float b)
		{
			this.h=h;
			this.b=b;
		}
		public double area()
		{
			return (h * b)/2;
		}
}
class Ractangle
{

			float l,w;

		Ractangle(float l,float w)
		{
			this.l=l;
			this.w=w;
		}
		public double area()
		{
			return l *w;
		}
}
public class Shape
{
	public static void main(String a[])
	{
		float r;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Radius of circle ");
		r=s.nextFloat();
		Circle c=new Circle(r);
		System.out.println("Area of circle "+c.area());
		float b;
		System.out.print("Enter BASE  of Traingle ");
		r=s.nextFloat();
		System.out.print("Enter height of Traingle ");
		b=s.nextFloat();
		Triangle t=new Triangle(r,b);
		System.out.println("Area of Traingle "+t.area());
		System.out.print("Enter lengtgh  of Rectangle ");
		r=s.nextFloat();
		System.out.print("Enter width of Rectangle ");
		b=s.nextFloat();
		Ractangle ra=new Ractangle(r,b);
		System.out.println("Area of Rectangle "+ra.area());
	}
}