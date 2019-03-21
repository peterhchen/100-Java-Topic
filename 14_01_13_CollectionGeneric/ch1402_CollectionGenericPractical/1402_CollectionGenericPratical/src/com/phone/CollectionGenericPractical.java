package com.phone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Collection: Java 1.2 Generic: Java 1.5
// Java 1.8, we have all the collections and Generic
public class CollectionGenericPractical {
	public static void main (String a[]) throws Exception {
		// We want different types mixed together
//		int values[] = new int [4];
//		Object values1[] = new Object[4];
//		values1[0] = "Peter";
//		values1[1] = 7;
		Collection values = new ArrayList ();
		values.add(3);
		values.add("Peter");
		values.add(5.3f);	
		
//		We can use 1) iterator 2) enhanced for loop.
// Iterator is very old technique.
//		Iterator i = values.iterator();
//		while (i.hasNext()) {
//			System.out.println (i.next());
//		}
		
		for (Object i: values){
			System.out.println (i);
		}
	}	
}
