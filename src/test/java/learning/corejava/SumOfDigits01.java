package learning.corejava;

public class SumOfDigits01 {
	
	    public static void main(String[] args) {
	        int num = 9;
	        System.out.println(getSumOfDigits(num));
	    }
static int sum=0;
	    public static int getSumOfDigits(int num)	{
		    if(num<10||num>99)
		    {
		    	return 0;
		    }
		    else {
		    	
		    	sum=num/10+num%10;
		    
	    	return sum;}
	    }
}


