interface Geometry
{
	int c=10;
	float perimetr();
}
public class Geometry1 implements Geometry
{
	public static void main(String ar[])
	{
		c=11;
		System.out.print(c);

	}
	public float perimetr()
	{
		return 4;
	}
}