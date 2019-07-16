public class Pattern
{
	public static void main(String a[])
	{
		int i,j,sp,n=3;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(a[0]);
			}
			for(sp=n-i;sp>1;sp--)
			{
				System.out.print(" ");
			}
			for(sp=n-i;sp>0;sp--)
			{
				System.out.print(" ");
			}
			if(i==n)
			{
				for(j=1;j<=i-1;j++)
				{
								System.out.print(a[0]);
				}
			}
			else
			{
				for(j=1;j<=i;j++)
							{
								System.out.print(a[0]);
							}
			}

			System.out.println("");
		}
		for(i=n-1;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(a[0]);
			}
			for(sp=n-i;sp>1;sp--)
			{
				System.out.print(" ");
			}
			for(sp=n-i;sp>0;sp--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(a[0]);
			}
			System.out.println("");

		}
	}
}