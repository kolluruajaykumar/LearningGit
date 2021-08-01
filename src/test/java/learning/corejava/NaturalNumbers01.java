package learning.corejava;

public class NaturalNumbers01 {

	public static void main(String[] args) {
		System.out.println(getNaturalNumbers1 (10, 20));
    }
	public static String getNaturalNumbers1 (int num1,int num2)	{
String result = "";
if(num1<=0 || num2<=0)
{
return "-1";}
if(num1>num2)
{return "-2";}
while(num1<=num2)
{
if(num1==num2)
{
result +=num1;
}else
{
result +=num1+" ";
}
num1++;}

     return result;
    }
}
