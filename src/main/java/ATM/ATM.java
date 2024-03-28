package ATM;
import java.util.Scanner;
public class ATM
{
	public static void main(String[] args)
	{		
		

		while(true)
		{
			System.out.println(":-------------------:");
			System.out.println("Enter 1:Show Detail");
			System.out.println("Enter 2:Deposit Money");
			System.out.println("Enter 3:Withdraw Money");
			System.out.println("Enter 4:Show Balance");
			System.out.println("Enter 5:Exit");
	
			Scanner sc=new Scanner(System.in);
			int c=sc.nextInt();
			Method me=new Method();
		
			if(c==1)
			{
				me.showDetail();
			}
			else if(c==2)
			{
				me.depostiMoney();
			}
			else if(c==3)
			{
				me.withdrawMoney();
			}
			else if(c==4)
			{
				me.showBalance();
			}
			else if(c==5)
			{

				System.out.println("     Thank you!     ");
				System.out.println("........Exit.....");
				break;
			}
			else
			{
				System.out.println("Sorry wrong choice");
				System.out.println("Enter Correct Option..");
			}	
		}
		
	}
}