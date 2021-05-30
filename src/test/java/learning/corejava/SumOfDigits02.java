package learning.corejava;

import java.util.Scanner;

public class SumOfDigits02 {

	public static void main(String[] args) {
		System.out.println("enter a value");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		if(num>9&&num<100) {
			while(num>0)
		{
			int rem=num%10;
			sum +=rem;
			num /=10;
			}
		
		System.out.println(sum);}
		else {
			System.out.println("not a vald input");
		}
		
	//	 TODO Auto-generated method stub

	}
}


