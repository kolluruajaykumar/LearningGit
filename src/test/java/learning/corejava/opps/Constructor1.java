package learning.corejava.opps;

public class Constructor1 {

	public static void main(String[] args) {
		Scoc1 d=new Scoc1();
		Scoc1 s=new Scoc1(25,"ajay","male");
		d.display();
		s.display();
		Scoc1 h=new Scoc1(100,"aaaa","m");
		h.display();
	}

}
