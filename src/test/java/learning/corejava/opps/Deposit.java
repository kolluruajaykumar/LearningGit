package learning.corejava.opps;

public class Deposit {
	Balance b1;
	Deposit(Balance b1)
	{
		this.b1=b1;
	}
	public void deposit(int damt) {
		
	System.out.println("amount deposited:"+damt);
	b1.bal=b1.bal+damt;
	b1.disBal();
	System.out.println("Traction completed");
	}
}
