package learning.corejava;

public class String02 {

	public static void main(String[] args) {
		String a="Hi,this is ajay kumar KOLLURU,9052271330";
			char b=a.charAt(9);
			System.out.println(b);
			char[] c=new char[10];
		//	int start=2;
		//	int end=6;
			a.getChars(2, 6, c, 2);
	System.out.println(c);
	char[] d=a.toCharArray();
	System.out.println(d);
	System.out.println(d[5]);
	for(int i=0;i<d.length;i++)
	{
		System.out.print(d[i]);
	}
	System.out.print("\n");
	byte[] e=a.getBytes();
System.out.println("ajay");
for(int j=0;j<e.length;j++)
{ System.out.print(e[j]+" ");
System.out.print((char)e[j]+" ");		
	}
	}
	

}
