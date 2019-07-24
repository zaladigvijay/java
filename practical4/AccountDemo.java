import java.util.*;
class Account
{
	private String CustName=new String();
	private int acno;
	private String type=new String();
	private String branch=new String();
	Account(String type)
	{
		this.type=type;
	}
	public void getCustInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter customer Name :");
		CustName=sc.next();
		System.out.print("Enter customer Account number :");
		acno=sc.nextInt();
		System.out.print("Enter Branch Name :");
		branch=sc.next();

	}
	public void displayInfo()
	{
		System.out.println("Account Number : "+acno);
		System.out.println("Customer  Name : "+CustName);
		System.out.println("Account Type : "+type);
		System.out.println("Branch Name : "+branch);
	}
}
class Saving extends Account
{
		private float amount;
		private float year;
		private static final float Rate=3.5f;
		Saving(String type)
		{
				super(type);
		}
		public void getSavingInfo()
		{
			getCustInfo();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Amount  :");
			amount=sc.nextFloat();
			System.out.print("Enter Year :");
			year=sc.nextFloat();
		}
		public void displayInfo()
		{
			super.displayInfo();
			System.out.println("Amount : "+amount);
			System.out.println("Year : "+year);
			System.out.println("Rate : "+Rate);
		}
		public float calIntAmt()
		{
				return amount+(amount*year*Rate)/100;
		}
}
class FixedDeposite extends Account
{
		private float amount;
		private float year;
		private static  float Rate;
		FixedDeposite(String type)
		{
				super(type);
		}
		public void getFdInfo()
		{
			getCustInfo();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Amount  :");
			amount=sc.nextFloat();
			System.out.print("Enter Year :");
			year=sc.nextFloat();
			if(year<=2)
				Rate=6.5f;
			else if(year<=5 && year>2)
				Rate=7.5f;
			else if(year<=10 && year>5)
				Rate=8.5f;
			else if( year>10)
				Rate=9f;
		}
		public void displayInfo()
		{
			super.displayInfo();
			System.out.println("Amount : "+amount);
			System.out.println("Year : "+year);
			System.out.println("Rate : "+Rate);
		}
		public float calIntAmt()
		{
				return amount+(amount*year*Rate)/100;
		}
}
public class AccountDemo
{
		public static void main(String ar[])
		{
			System.out.println("1.Saving");
			System.out.println("2.FD Account");
			System.out.println("Enter choice ");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			if(ch==1)
			{
				Saving s1=new Saving("saving");
				s1.getSavingInfo();
				s1.displayInfo();
				System.out.println("Amount after calculate intrest "+s1.calIntAmt());
			}
			else if(ch==2)
			{
				FixedDeposite f1=new FixedDeposite("FixedDeposite");
				f1.getFdInfo();
				f1.displayInfo();
				System.out.println("Amount after calculate intrest "+f1\.calIntAmt());
			}
			else
			{
					System.out.printf("Invalid choice");
			}
		}
}