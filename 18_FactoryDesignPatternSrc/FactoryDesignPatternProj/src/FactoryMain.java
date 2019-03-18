import com.phone.AndroidOS;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMain {
	public static void main (String a[]) {
		System.out.println ("Hello Factory Main Project");
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS obj;
		obj = osf.getInstance("Android Phone");
		obj.spec();
		obj = osf.getInstance("Apple iPhone");
		obj.spec();
		obj = osf.getInstance("PC OS");
		obj.spec();
		obj = osf.getInstance("");
		obj.spec();
	}

}
