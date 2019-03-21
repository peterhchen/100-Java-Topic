package com.phone;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class InternalIterationMain {
	public static void main (String args[] ) { 
		System.out.println ("Internal Iteration");
		// Arrays.asList is a fixed size array in class java.util.Arrays
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		// First way: for loop
		System.out.println ("First way: simple for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.print (" list[i]: "  + list.get(i));
		}
		// Second way: Object Iterator.
		// Once you get the iterator, you can navigate the iterator
		System.out.println ("\nSecond way: Ierator");
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.print (" iter.next(): "  + iter.next());
		}
		// Third way: Enhanced for loop
		System.out.println ("\nThird way: Enhanced for loop");
		for (Integer i: list) {
			System.out.print (" i:" + i);
		}
	}
}
