package learning.corejava;

import java.util.Scanner;
public class First2 {
public static void main(String[] args) {
		int k[]=new int[3];
		int i=0;
		Scanner s=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter a number");
		if(s.hasNextInt())
		{
			 k[i]=s.nextInt();
			 
			System.out.println("are you want to continue");
			s.nextLine();
			String b=s.nextLine();
			if(b.equals("yes"))
				{
				i++;
				if(i==3)
				{
					break;
				}
				//continue;
			}//else if(b.equals("no"))
			//{
			//	break;
			//}
			else 
			{
				break;
			}
			
		}
		else {
			System.out.println("enter a proper string");
			s.nextLine();
			//continue;
            }
		//continue;
        }
        }
       }