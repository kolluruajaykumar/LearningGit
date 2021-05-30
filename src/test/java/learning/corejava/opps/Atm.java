package learning.corejava.opps;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	boolean k;
	int count=0;
 while(true) {
	System.out.println("enter your pin number");
	int pinNo=s.nextInt();
	if(pinNo>=1000&&pinNo<=9999)
	{
		Pincheck pk=new Pincheck();
		k=pk.pinverify(pinNo);
	      if(k) {
			System.out.println(" ----- choices-----");
			System.out.println("1.withdraw\n2.deposit\n3.payment");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter amount");
				int amt=s.nextInt();
				if(amt>0&&amt%100==0)
				{
				Balance b=new Balance();
				Withdraw w=new Withdraw(b);
				w.wDraw(amt);
				break;
				
			}else {
				System.out.println("invalid amount");
			}break;
			case 2:
				System.out.println("enter amount");
				int damt=s.nextInt();
				if(damt>0&&damt%100==0)
				{
					Balance b1=new Balance();
				Deposit d=new Deposit(b1);
				d.deposit(damt);
				break;
				}else
				{
					System.out.println("invalid amount");
				}break;
			case 3:
				System.out.println("enter the amount");
	           float pay=s.nextFloat();
				if(pay>0) {
				Balance b2=new Balance();
				Payment p=new Payment(b2);
				p.payment(pay);
				break;
				}else
				{
					System.out.println("invalid amount");
				}break;
			}break;
			}
			else {
				System.out.println("wrong pin number");
				count++;
			}
		}
	else
	{
		System.out.println("invalid pin number");
		count++;
	}
	if(count==3)
	{
		System.out.println("tranction blocked temporarily");
		break;
	}
	
	}
	}

}
