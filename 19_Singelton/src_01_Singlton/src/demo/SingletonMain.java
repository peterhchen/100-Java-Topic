package demo;

public class SingletonMain {
	public static void main (String a[]) {
		System.out.println ("Hello Singleton Proj");
		Abc obj1 = Abc.getInstance();
		Abc obj2 = Abc.getInstance();
		// You cannot crate new instance by
		// Abc obj2 = new Abc();
	}
}

class Abc
{
	static Abc obj = new Abc();
	private Abc () {
		
	}
	public static Abc getInstance () {
		return obj;
	}
	
}
