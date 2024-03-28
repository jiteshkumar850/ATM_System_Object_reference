package ATM;
public class Base
{
	private int empid;
	private String name;
	private int amount;
	
	public Base(int id,String naam,int salary)
	{
		empid=id;
		name=naam;
		amount=salary;	
	}

	public int getId()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int arg)
	{
		amount=arg;
	}
}