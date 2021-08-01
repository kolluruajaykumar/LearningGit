package learning.corejava;

public class Continue {

	public static void main(String[] args) {
		

		        String str = "www.c4learn.com";

		        int max = str.length();
		        int count = 0;

		        for (int i = 0; i < max; i++) {

		            if (str.charAt(i) != 'w')
		            { 
		            	continue; //it will skip the rest statement 
		            }
		            
		            count++;
		        }

		        System.out.println("Counting W : " + count );
		    }
		
		// TODO Auto-generated method stub

	}


