package cm.dart.heloworld;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.BigDecimal;

public class Arrondir {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nb1 = 4.999;
		double nb2 = 5.0;
		double nb3 = 5.001;
		
		System.out.println("            Exection avec ceil");
		System.out.println("ceil(4.999) = "+ Math.ceil(nb1));
		System.out.println("ceil(5.0) = "+ Math.ceil(nb2));
		System.out.println("ceil(5.001) = "+ Math.ceil(nb3));
		
		System.out.println("            Exection avec floor");
		System.out.println("floor(4.999) = "+ Math.floor(nb1));
		System.out.println("floor(5.0) = "+ Math.floor(nb2));
		System.out.println("floor(5.001) = "+ Math.floor(nb3));
		
		System.out.println("            Exection avec rint");
		System.out.println("rint(4.999) = "+ Math.rint(nb1));
		System.out.println("rint(5.0) = "+ Math.rint(nb2));
		System.out.println("rint(5.001) = "+ Math.rint(nb3));
		
		System.out.println("            Exection avec round");
		System.out.println("round(4.999) = "+ Math.round(nb1));
		System.out.println("round(5.0) = "+ Math.round(nb2));
		System.out.println("round(5.001) = "+ Math.round(nb3));
	}

}
