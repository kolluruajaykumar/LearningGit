package learning.corejava;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enetr val1");
		int val1=s.nextInt();
		System.out.println("eneter val2");
		int val2=s.nextInt();
		float avg=(float)(val1+val2)/2;
		System.out.println("avg:"+avg);
		
		
		}

}
