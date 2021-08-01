package learning.corejava.opps;

public class Payment {
	Balance b2;
	void payment(float pay)
	{ if(pay<b2.bal) {
		b2.bal=b2.bal-(float)pay;
		b2.disBal();
		System.out.println("tranction completed");
	}
	else
	{
		System.out.println("insuficent fund");
	}}
 Payment( Balance b2)
{
	this.b2=b2;
}
}
