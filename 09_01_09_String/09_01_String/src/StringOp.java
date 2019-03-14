import java.util.Scanner;

public class StringOp {
	public static void main (String [] args) {
		String s1, s2;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Enter 2 stringd: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		// Step 1:
		int l1 = s1.length();
		int l2 = s2.length();
		
		System.out.println ("String 1 length: " + l1);
		System.out.println ("String 2 length: " + l2);
		
		// Step 2:
		//String s3 = s1.concat(s2);
		String s3 = s1 + s2; 
		System.out.println ("Resut on Concatenation is: " + s3);
		
		// Step 3:
		System.out.println ("1st String Uppercasre: " + s1.toUpperCase());
	}

}
