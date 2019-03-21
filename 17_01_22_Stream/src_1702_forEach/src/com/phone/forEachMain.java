package com.phone;

import java.util.Arrays;
import java.util.List;

public class forEachMain {
	public static void main (String args[]) {
		System.out.println ("forEach");
		List <Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		// We will use internal iteration.
		// forEach need consumer interface.
		list.forEach(i -> System.out.println (i));
	}
}
