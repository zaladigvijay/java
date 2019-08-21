import java.util.*;
class InvalidUsernameException extends Exception
{
	String msg;
	public InvalidUsernameException(String msg)
	{
		this.msg=msg;
	}
	public void Message()
	{
		System.out.println(msg);


	}
}
class CustomException
{
	public static void main(String []args)
	{
		String username;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter username  : ");
			username=sc.next();
			if(username.length()<4 || username.length()>10 || !username.matches("^[a-zA-Z0-9]*$"))
			{
				throw new InvalidUsernameException("You entered invalid username : "+username);
			}

		}
		catch(InvalidUsernameException e)
		{
			e.Message();
		}
	}
}
