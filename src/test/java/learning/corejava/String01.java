package learning.corejava;

public class String01 {

	public static void main(String[] args) {
		String s1="Summer";
		String s2=s1+"winter";//Summerwinter
		s1.concat(s2);//SummerSummerwinter
		s1+=s2;//SummerSummerwinter
		s2.concat(s1);//SummerwinterSummer
		s2=" "+s1+" "+"aj";// SummerSummerWinter aj
		System.out.println(s1);
		System.out.println(s2);
		char c[]= {65,90,122};
		System.out.println(c);

	}

}
