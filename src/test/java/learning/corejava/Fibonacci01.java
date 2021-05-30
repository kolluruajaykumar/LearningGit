package learning.corejava;

public class Fibonacci01 {

	public static void main(String[] args) {
		System.out.println(getFibonacciSeries(10));
	}
	public static String getFibonacciSeries(int num) {

if(num<1 || num>40)
{
return "-1";}
if(num==1)
{
return "0";
	}if(num==2)
{
	return "0,1";
	}
	String result= "0,1";
	int first=0;
	int second=1;
	int third;
	
for(int n=0;n<num-2;n++)
{
	third=first+second;
		first=second;
		second=third;

	result +=","+third;
}

return result;

		// TODO Auto-generated method stub

	}

}
