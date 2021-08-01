package learning.corejava.opps;

public class Withdraw {
	Balance x;
	public void wDraw(int amt)
	{
		if(amt<=x.bal)
		{
			System.out.println("amount withdrawn:"+amt);
			x.bal=x.bal-amt;
			x.disBal();
			System.out.println("tranction completed");
		}else {
		System.out.println("insufficient fund");
		}
		
	}
	 Withdraw(Balance x)
 {
	 this.x=x;
 }
}
