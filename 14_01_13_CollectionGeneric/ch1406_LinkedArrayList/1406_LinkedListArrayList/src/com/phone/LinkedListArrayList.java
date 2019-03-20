package com.phone;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Both LInked List and Arary List implement the List Interface.
// The results are the same. Only the implementations are different.
// Linked List implement by Double Linked List. 
// ArrayList implement by Array.
public class LinkedListArrayList {
	public static void main (String a[]) {
		List arrList = new ArrayList();
		arrList.add ("Peter");
		arrList.add ("Irene");
		arrList.add ("Jason");
		arrList.add ("Jessica");
		arrList.add ("Jason");
		arrList.add ("Jasmine");
		arrList.add ("Jonthan");
		System.out.println();
		System.out.println ("ArrayList Elements: ");
		System.out.print ("\t" + arrList);
		
		List linkList = new LinkedList(); 
		linkList.add ("Peter");
		linkList.add ("Irene");
		linkList.add ("Jason");
		linkList.add ("Jessica");
		linkList.add ("Jason");
		linkList.add ("Jasmine");
		linkList.add ("Jonthan");
		System.out.println();
		System.out.println ("LinkedList Elements: ");
		System.out.print ("\t" + linkList);		
	}

}
