package learning.corejava;


import java.util.Scanner;

public class First1 {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		if(s.hasNextInt())
		{
			int a=s.nextInt();
			System.out.println("entered value is"+a);
		}
		else {
			
			System.out.println("please enter a proper string");
			
		}
		// TODO Auto-generated method stub

	}

}
