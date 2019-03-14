import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	public static void main (String [] args) throws Exception {
		
		Save obj = new Save();
		obj.i = 4;
		// Serialization:
		// f is file obj
		File f = new File ("Obj.txt");
		// Transform text format into stream object. 
		FileOutputStream fos = new FileOutputStream (f);
		// We are not store data. We store object into file.
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(obj);
		// Open the obj.txt with text Word Pad, 
		// you will see the Save class and I are store in stream object.
		
		// De-serialization:
		FileInputStream fis = new FileInputStream (f);
		ObjectInputStream ois = new ObjectInputStream (fis);
		Save obj1 = (Save) ois.readObject();
		System.out.printf("Valueof Obj1: " + obj1.i);
	}
}

// TSave need to implement the interface Serializable
class Save implements Serializable {
	int i;
}