package learning.corejava;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=0;
		while(i<9) {      /* something wrong*/
			
			if(i==5)
			{
				continue;
			}
			System.out.print(i);
			i++;
			}
		s.nextLine();
	/*	while(i<9) {
			System.out.print(i);
			i++;
			if(i==5)
			{
				continue;
			}
		}
		s.nextLine();
		while(i<9) {
			System.out.print(i);
			if(i==5)
			{
				continue;
			}
			i++;
		}*/

	}

}
