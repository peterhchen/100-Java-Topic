package com.phone;
// w3schools:
// enum is a special class that represent a groups of constants.
// enum level { LOW, MEDIUM, HIGH }
enum Car {
	lamborghin (900), tat(2), audi (50), fiat(15), honda(12);

	private int price;
	Car (int p) {
		price = p;
	}
	int getPrice () {
		return price;
	}
}
public class EnumClassMain {
	public static void main (String args[]) {
		System.out.println ("All car prices:");
		// w3school
		// for (type variable: array-name)
		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		// for (String i: cars) { System.out.println (i) }
		for (Car c: Car.values()) {
			System.out.println (c + " costs " + c.getPrice() + " thousand dollors.");
		}
	}

}
