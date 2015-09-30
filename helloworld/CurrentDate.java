package cm.dart.helloworld;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

		public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dateFormat1=new SimpleDateFormat("dd/MM/yyyy HH:mm");
		System.out.println(dateFormat1.format(date)); 
		System.out.println(dateFormat.format(date));
//	scanner
		}

}
