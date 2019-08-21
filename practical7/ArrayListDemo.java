import java.util.*;
class ArrayListDemo
{
	public static void main(String ar[])
	{
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int in;
		al.add("abc");
		al.add("def");
		String val;
		System.out.println("Enter value to insert in array list");
		val=sc.next();
		al.add(val);

		System.out.println(al);
		System.out.println("Enter index");
		in=sc.nextInt();
		System.out.println("Enter value to insert in array list");
		val=sc.next();
		al.add(in,val);
		System.out.println(al);
		System.out.println("Enter value to remove in array list");
		val=sc.next();
		al.remove(val);
		System.out.println(al);
		System.out.println("Enter index");
		in=sc.nextInt();
		al.remove(in);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

		System.out.println("Enter index");
		in=sc.nextInt();
		System.out.println("Enter value to replace in array list");
		val=sc.next();
		al.set(in,val);
		System.out.println(al);

		System.out.println("Enter index");
		in=sc.nextInt();

		System.out.println(al.get(in));

		Iterator i=al.iterator();
		Systerm.out.println("Element using iterator : ");

		  while(i.hasNext()){
		   System.out.println(i.next());
		  }

	}
}