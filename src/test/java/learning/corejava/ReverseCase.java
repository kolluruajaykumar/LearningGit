package learning.corejava;

import java.util.Scanner;

public class ReverseCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String a=s.nextLine();
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=65&&c[i]<=90)
			{
				c[i]+= 32;
			//int x=(int)c[i]+32;/*casting operator not effecting here  */
			//c[i]=(char)x;
			System.out.print(c[i]);
			}
			else if(c[i]>=97&&c[i]<=122)
			{
				c[i]-=32;
				//int x=(int)c[i]-32;
			  //  c[i]=(char)x;
				System.out.print(c[i]);
			}
		}
	}

}
