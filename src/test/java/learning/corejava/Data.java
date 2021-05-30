package learning.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner s=new Scanner(new File("g:\\aa.txt"));
		while(s.hasNext())
		{
			String a=s.nextLine();
			System.out.println(a);
		}
		
	}

}
