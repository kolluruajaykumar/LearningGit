package learning.corejava;

public class String03 {

	public static void main(String[] args) {
		String a="HelloWorldHe";
		String b="helloworld";
		String c="hellohello,hi";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.regionMatches(1,b,1,3));
		System.out.println(a.startsWith("HeL"));
		System.out.println(a.startsWith("orl",6));
		System.out.println(a.endsWith("rld"));
		String e=a.substring(5);
		System.out.println(e);
	    String f=a.substring(2, 5);
		System.out.println(f);
		System.out.println(a.replace('l','c'));
		System.out.println(a.replace("He", "niv"));
		System.out.println(a.replaceFirst("He","n"));
		System.out.println(a.replaceAll("He", "m"));
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(c));
		
		}
	}