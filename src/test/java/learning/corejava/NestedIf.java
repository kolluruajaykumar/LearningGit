package learning.corejava;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		while(true) {
		
		System.out.println("eneter your pinNum");
		int pinNum=i.nextInt();
		if(pinNum>=1000 && pinNum<=9999)
		{
			while(true) {
			System.out.println("eneter the amount");
			int amt=i.nextInt();
			if(amt>0&&amt%100==0)
			{
				System.out.println("Amount withdrawn:"+amt);
				System.out.println("tranction completed successfully");
				break;
				
			}
			else {
				System.out.println("invalid amount");
			}}
		}
		else
			{System.out.println("invalid pin");
			}
	
		// TODO Auto-generated method stub

	}}}


