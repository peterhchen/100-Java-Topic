package com.phone;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionMain {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//		Consumer<Integer> c = new Consumer <Integer> () {
//			public void accept (Integer i) {
//				System.out.println (i);
//			}
//		};
		
//		Consumer <Integer> c = i-> System.out.println (i);
//		list.forEach (c);
		
		list.forEach (i -> System.out.println (i));
	}
}