package learning.corejava;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num");
		int num=Integer.valueOf(s.nextLine());
		if(num%2==0)
		{
			System.out.println("num is even");
		}
		else {
			System.out.println("num is odd");
		}
		// TODO Auto-generated method stub

	}

}
