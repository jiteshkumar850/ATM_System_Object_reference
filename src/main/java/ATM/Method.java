package ATM;
import java.util.Scanner;
public class Method
{	
	Base b=new Base(399966657,"Jitesh",6500);
	public void showDetail()
	{
		int id=b.getId();
		String name=b.getName();
		System.out.println(":-------------------:");
		System.out.println("Dear"+name);
		System.out.println("Your ID:"+id);

	}
	public void depostiMoney()
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int k=b.getAmount()+a;
		b.setAmount(k);
	}
	public void withdrawMoney()
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int o=b.getAmount();
		if(n>o)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{	
			int j=o-n;
			b.setAmount(j);
		}
	}
	public void showBalance()
	{
		int p=b.getAmount();
		System.out.println(p);
	}
}