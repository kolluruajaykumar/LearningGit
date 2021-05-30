package learning.corejava;

import java.util.Scanner;

public class StuData {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sName");
		String sName=s.nextLine();
		System.out.println("enter the branch");
		String br=s.nextLine();
	    boolean k;
		if(br.length()==3)
		{
			switch(br) {
			case "ece":k=true;
			break;
			case "eee":k=true;
			break;
			case "cse":k=true;
			break;
			default:k=false;
			}
			if(k) 
			{
			while(true)
			{
				System.out.println("enter the rollNo");
				String rollNo=s.nextLine();
				if(rollNo.length()==10)
				{
					while(true){
				    System.out.println("enter the telugu marks");
					int t=s.nextInt();
					System.out.println("enter the hindi marks");
					int h=s.nextInt();
					System.out.println("enter the english marks");
					int e=s.nextInt();
					System.out.println("enter the maths marks");
					int m=s.nextInt();
					System.out.println("enter the science marks");
					int sci=s.nextInt();
					System.out.println("enter the scocial marks");
					int sco=s.nextInt();
					if((t>=0&&t<=100)&&(h>=0&&h<=100)&&(e>=0&&e<=100)&&(m>=0&&m<=100)&&(sci>=0&&sci<=100)&&(sco>=0&&sco<=100))
					{
				    int totMarks=t+h+e+m+sci+sco;
					float per=(float)totMarks/6;
					System.out.println("sName:"+sName);
					System.out.println("branch:"+br);
					System.out.println("rollNo:"+rollNo);
					System.out.println("totMarks:"+totMarks);
					System.out.println("per:"+per);
					if(t<35||h<35||e<35||m<35||sci<35||sco<35||per<35)
					{
					System.out.println("result:Fail");
					break;
					}else if(per>=35&&per<50) {
						System.out.println("result:Third class");
						break;
					}else if(per>=50&&per<60) {
						System.out.println("result:Second class");
						break;
					}else if(per>=60&&per<70) {
						System.out.println("result:First class");
						break;
					}else
					{
						System.out.println("result:Distinction");
						break;
					}

					}
				}
					break;
					}
			else {System.out.println("invalid rollNo");
				}
				}
				}else {
				System.out.println("invalid branch");
				}
		}else {
			System.out.println("invalid branch");
		}
		}
	}
