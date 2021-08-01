package learning.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {
	
		
	String str="SSddy 212d3 4%^&";
	String str1= str.replaceAll("[^0-9]+", "");
	System.out.println(str1);
	String str2= str.replaceAll("[^a-z,A-Z]+", "");
	System.out.println(str2);
	String str3= str.replaceAll("[a-z,A-Z,0-9]+", "");
	System.out.println(str3);
	
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='d')
		{
			count++;
		}
	}
  System.out.println(count);
  
  str=str.toLowerCase();
  char[] c=str.toCharArray();
  HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
  for(int i=0;i<c.length;i++)
  {
	
	  if(hm.containsKey(c[i]))
	  {
		  hm.put(c[i], hm.get(c[i])+1);
	  }
	  else {
		  hm.put(c[i], 1);
	  }
  }
  
  for(Entry<Character,Integer> e:hm.entrySet())
  {
	  System.out.println(e.getKey() +":"+e.getValue());
  }
  
  for(char ch:hm.keySet())
  {
	 if(hm.get(ch)>1)
	 {
		 System.out.println(ch+" occured for "+hm.get(ch) +" times");
	 }
  }
  
}
}