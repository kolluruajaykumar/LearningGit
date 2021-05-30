package learning.corejava;

public class Palindrome {
    public static void main(String[] args) {
        int num = 879;
        System.out.println(isPalindrome(num));
    }

    public static int isPalindrome(int n) {
    	if(n<100||n>999)
    	{
    		return -1;
    	}else if(n/100==n%10)
    	{
    		return 1;
    	}else
       return 0;
    }
}


