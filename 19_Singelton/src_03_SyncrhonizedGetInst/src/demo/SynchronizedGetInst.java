package demo;

public class SynchronizedGetInst {
	public static void main (String a[]) {
		System.out.println ("Hello Singleton Lazy Inst");
		Thread t1 = new Thread (new Runnable () {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Abc obj1 = Abc.getInstance();
			}
		}); 
		
		Thread t2 = new Thread (new Runnable () {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Abc obj = Abc.getInstance();
			}
		}); 

		t1.start();
		t2.start();
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
	public static synchronized Abc getInstance () {
		// If yo remove the check, the object is created rwice.
		if (obj == null) {
			obj = new Abc();
		}
		return obj;
	}	
}
