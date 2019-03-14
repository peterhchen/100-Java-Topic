// StringBuffer and StringBuilder
// StringBuffer is mutable and thread safe for multiple thread.
// StringBuilder is mutable but not thread safe.
// They both have the same methods.

public class StringMutable {
	public static void main (String [] args) {
		StringBuffer sbf = new StringBuffer ("Peter");
		System.out.printf ("sbf: %s\n", sbf);
		sbf.append(" Chen");
		sbf.insert (0, "Irene "); 
		System.out.printf ("sbf: %s\n", sbf);
		sbf.replace (0, 5, "Jonathan"); // replace by index of position
		System.out.printf ("sbf: %s\n", sbf);
		sbf.delete(8, 10); // delete character by index position.
		System.out.printf ("sbf: %s\n", sbf);
	}

}
