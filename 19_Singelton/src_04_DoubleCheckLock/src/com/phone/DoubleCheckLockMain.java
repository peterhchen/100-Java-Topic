package com.phone;

public class DoubleCheckLockMain {
	public static void main (String a[]) {
		System.out.println ("Double Check Lock");
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
		// We can add delay. Sleep for 10 mini-seconds
		// comment out since it waste time.
		// try { Thread.sleep (10); } catch (Exception e) { }
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
	public static Abc getInstance () {
		// Double Checked Locking
		if (obj == null) {
			synchronized (Abc.class) {
				if (obj == null)
					obj = new Abc();
			}

		}
		return obj;
	}	
}
