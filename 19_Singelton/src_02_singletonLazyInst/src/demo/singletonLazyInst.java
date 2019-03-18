package dem;

public class singletonLazyInst {
	public static void main (String a[]) {
		System.out.println ("Hello Singleton Lazy Inst");
		Abc obj1 = Abc.getInstance();
		Abc obj2 = Abc.getInstance();
		// You cannot crate new instance by
		// Abc obj2 = new Abc();
	}
}

class Abc{
	// by default it is eager
	//public static Abc obj = new Abc(); 
	public static Abc obj; 
	int i;
	private Abc () {
		System.out.println ("Instance created");
		
	}
	public static Abc getInstance () {
		// If yo remove the check, the object is created rwice.
		if (obj == null) {
			obj = new Abc();
		}
		return obj;
	}
	
}