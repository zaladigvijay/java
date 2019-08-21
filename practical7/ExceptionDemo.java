import java.util.Scanner;
import java.util.*;
class ExceptionDemo
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String username;

		int sem;
		try
		{
			System.out.print("Enter username");
			username=sc.next();
			System.out.print("Enter Semester");
			sem=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("Good Bye");

		}
	}

}
