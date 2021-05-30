package learning.corejava;

import java.util.*;
public class String04 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String a=s.nextLine();
		String ch=s.nextLine();
	   System.out.println(a.indexOf(ch));//default (first) 
	   System.out.println(a.lastIndexOf(ch));
	   System.out.println("talent sprint".indexOf("e"));
	   System.out.println("AjAy".replace('A','@'));
	   System.out.println("ajay".indexOf("j"));
System.out.println(a.toLowerCase());
System.out.println(a.toUpperCase());
System.out.println(a.length());
}
}