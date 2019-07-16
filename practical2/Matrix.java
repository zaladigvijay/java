import java.util.Scanner;
public class Matrix
{
	public static void main(String a[])
	{
			int r1,c1,r2,c2;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter rows of matrix1 : ");
			r1=s.nextInt();
			System.out.print("Enter columns of matrix1 : ");
			c1=s.nextInt();
			System.out.print("Enter rows of matrix2 : ");
			r2=s.nextInt();
			System.out.print("Enter columns of matrix2 : ");
			c2=s.nextInt();
			if(c1 != r2)
			{
				System.out.println("Matrix Multiplication is not possible ");
				return;
			}
			int m1[][]=new int[r1][c1];
			int m2[][]=new int[r2][c2];
			int r[][]=new int[r1][c2];

			System.out.println("Enter matrix1 ");

			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print("m["+i+"]["+j+"]");
					m1[i][j]=s.nextInt();
				}
			}
			System.out.println("Enter matrix2 ");

			for(int i=0;i<r2;i++)
			{
					for(int j=0;j<c2;j++)
					{
							System.out.print("m["+i+"]["+j+"]");
							m2[i][j]=s.nextInt();
					}
			}

			for(int i=0;i<r1;i++)
			{
					for(int j=0;j<c1;j++)
					{
							r[i][j]=0;
							for(int k=0;k<r1;k++)
							{
								r[i][j]+=m1[i][k]*m2[k][j];
							}
					}
			}
			System.out.println("Matrix1 ");

			for(int i=0;i<r1;i++)
			{
						for(int j=0;j<c1;j++)
						{
								System.out.print(m1[i][j]+"\t");
						}
						System.out.println();
			}
			System.out.println("Matrix1 ");

			for(int i=0;i<r2;i++)
			{
					for(int j=0;j<c2;j++)
					{
						System.out.print(m2[i][j]+"\t");
					}
					System.out.println();
			}
			System.out.println("Result matrix ");

			for(int i=0;i<r1;i++)
			{
					for(int j=0;j<c2;j++)
					{
							System.out.print(r[i][j]+"\t");
					}
					System.out.println();
			}

	}

}