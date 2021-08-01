package learning.corejava.opps;

public class Scoc1 {
int age=27;
String name;
String gender;
 void display()
 { int age=26;
	 System.out.println(age);
	 System.out.println(name);
	 System.out.println(gender);
	 System.out.println(this.age);
 }
 public Scoc1() {
	 age=30;
	 name="aj";
	 gender="m";
			 
	 
 }
	public Scoc1(int age,String name,String gender)
	{
		this.age=age;
		this.name=name;
		this.gender=gender;
		
	}
}
