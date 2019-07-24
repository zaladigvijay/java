import java.util.*;
/**This is abstract class gometry
*@author Digvijaysinh
*@vesrion 1.0
*@since 2019-07-24
*/
abstract class Geometry
{
	/**This is abstract method perimeter
	*this is used for calulate parimetr
	*@return float as perimetr of shape
	*/
	abstract float perimeter();
}
/**This is  class square
*this is use for calculter perimeter of square
*this class extend geometry class geometry class
*@author Digvijaysinh
*@vesrion 1.0
*@since 2019-07-24
*/
class Square extends Geometry
{
	/**this is store length of square
	*/
	private float length;
	/**This is constructor of square class
		*this is used for calulate parimetr
		*@return float as perimetr of Square
		*parm float as lentgth of square
	*/
	Square(float length)
	{
		this.length=length;
	}
	/**This is  method perimeter
		*this is used for calulate parimetr
		*@return float as perimetr of shape
	*/
	public float perimeter()
	{
			return length*4;
	}
}
/**This is  class Circle
*this is use for calculter perimeter of circle
*this class extend geometry class geometry class
*@author Digvijaysinh
*@vesrion 1.0
*@since 2019-07-24
*/
class Circle extends Geometry
{
	/**this is store redius of square
	*/
	private float redius;
	/**this is constant thatb have value 3.14
	*/
	public final static float PI=3.14f;
	/**This is constructor of Circle class
			*this is used for calulate parimetr
			*@return float as perimetr of Circle
			*parm float as radius of circle
		*/
		Circle(float redius)
		{
			this.redius=redius;
		}
		/**This is  method perimeter
			*this is used for calulate parimetr
			*@return float as perimetr of circle
		*/
		public float perimeter()
		{
				return 2*PI*redius;
	}
}
/**This is class geometryDemo
*this contain main methdo
*@author digvijay'
*@since 2019-07-24
*@version 1.0
*/
public class GeometryDemo
{
	public static void main(String ar[])
	{
		System.out.println("1.Square");
		System.out.println("2.Circle");
		System.out.print("Enter choice ");
		Scanner sc=new Scanner(System.in);
		Geometry g;
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.print("Enter length of squre");
			float l=sc.nextFloat();
			g=new Square(l);
			System.out.println("Peimeter of square : "+g.perimeter());
		}
		else if(ch==2)
		{
			System.out.print("Enter redius of circle");
			float l=sc.nextFloat();
			g=new Circle(l);
			System.out.println("Peimeter of square : "+g.perimeter());
		}
		else
		{
				System.out.println("Invalid choice");
		}
	}
}