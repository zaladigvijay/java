public class Sort
{
	public static void main(String [] a)
	{
		String s;
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					s=String.valueOf(a[i]);
					a[i]=String.valueOf(a[j]);
					a[j]=String.valueOf(s);
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}