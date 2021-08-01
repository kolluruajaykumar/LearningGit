package learning.corejava;

import java.util.Scanner;

public class Sipher {/* sipher means A-Z,B-Y,a-z,b-y, you can get in two ways as shown below*/

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("eneter a string");
		String a=s.nextLine();
		char[] b=a.toCharArray();
		String y="";
		for(int i=0;i<b.length;i++)
		{
		if((int)b[i]>=65&&(int)b[i]<=90)
		{
			int x=b[i]-65;
			b[i]=(char)(90-x);
			y+=b[i];
			//System.out.print(b[i]);
			
		}
		else if((int)b[i]>=97&&(int)b[i]<=122)
{
	int x=b[i]-97;
	b[i]=(char)(122-x);
	y+=b[i];
	//System.out.print(b[i]);
	}
}System.out.println(y);

}
}
