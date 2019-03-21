package com.phone;
// Villain: Bad People
public class Villain implements Actor {
	public void act () {
		System.out.println ("I can Act");
	}
	public void speak () {
		System.out.println ("I can speak");
	}
	public void rude () {
		System.out.println ("I am rude");
	}
}