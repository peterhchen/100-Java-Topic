package com.phone;

public class Hero implements Actor {
	public void act() {
		System.out.println ("I can Act.");
	}
	public void speak () {
		System.out.println ("I can Speak.");
	}
	// extra method
	public void comedy () {
		System.out.println ("I can make people laugh.");
	}
}
