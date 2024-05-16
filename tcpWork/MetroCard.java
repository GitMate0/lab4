package tcpWork;

public class MetroCard implements java.io.Serializable
{
	private String serNum;
	private User usr;
	private String college;
	private double balance;

	public MetroCard(String serNum, User usr, String college, double balance)
	{
		this.serNum = serNum;
		this.usr = usr;
		this.college = college;
		this.balance = balance;
	}

	public MetroCard()
	{
		this.serNum = "";
		this.usr = null;
		this.college = "";
		this.balance = 0.0;
	}

	public String getSerNum()
	{
		return serNum;
	}

	public User getUser()
	{
		return usr;
	}

	public String getCollege()
	{
		return college;
	}

	public double getMoney()
	{
		return balance;
	}

	public void setSerNum(String serNum)
	{
		this.serNum = serNum;
	}

	public void setUser(User usr)
	{
		this.usr = usr;
	}

	public void setCollege(String college)
	{
		this.college = college;
	}

	public void setMoney(double balance)
	{
		this.balance = balance;
	}

	@Override
	public String toString()
	{
		return "№: " + serNum + "\nUser: " + usr + "\nCollege: " + college + "\nBalance: " + balance;
	}
}