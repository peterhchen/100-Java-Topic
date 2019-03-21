package com.phone;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionFunctionalMain {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList (1, 2, 3, 4, 5, 6);
//		list.forEach(i -> System.out.println (i));
		
		list.forEach(new Consumer <Integer>() {
			public void accept (Integer i) {
				System.out.println (i);
			}
		});
	}
}