package cm.dart.hellooworld;
import java.math.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Racine {

	public static void main(String[] args) {
		
		double discr, racine1, racine2;
		System.out.println("Application de l'equation quadratique");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez un entier a");
		double a = input.nextDouble();
		System.out.println("Entrez un entier b");
		double b = input.nextDouble();
		System.out.println("Entrez un entier c");
		double c = input.nextDouble();
		
		discr = Math.sqrt((b * b) - (4 * a * c));
		System.out.println("Discriminant = " + discr);
		
		if(discr> 0)
		     {
		System.out.println("           Equation a 2 racines");
		        racine1 = (-b + discr)/2 * a;
		        racine2 = (-b - discr)/2 * a;
		System.out.println("Premiiere racine = " + racine1);
		System.out.println("Seconde racine = " + racine2);
		     }
		
		if(discr == 0)
	      {
	    System.out.println("           Equation a 1 racine");
	        racine1 = (-b + discr)/2 * a;
	    System.out.println("Root = " + racine1);
	      }
		
	if(discr< 0)
	  {
	    System.out.println("           Equation a des racines imaginaire");
      }
	
  }
   	}
	

