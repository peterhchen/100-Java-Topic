package com.phone;
import com.phone.AndroidOS;
import com.phone.iOS;
import com.phone.Windows;

public class OperatingSystemFactory {
	public OS getInstance (String str) {
		if (str.equals("Android Phone")) {
			return new AndroidOS();
		} else if (str.equals ("Apple iPhone")) {
			return new iOS ();
		} else {
			return new Windows ();
		}
	}
}
