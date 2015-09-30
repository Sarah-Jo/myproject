package cm.dart.hellooworld;
import java.math.*;
import java.text.*;
import java.util.Scanner;
public class Sphere {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		 
	    double rayon = 0; 
	    double volume = 0;
	    double surface = 0;
	    double circonference = 0;
	    
	   
	 
	    System.out.print("Entrez le rayon du Sphere : ");
	    rayon = input.nextDouble();
	 
	    volume = (4 * Math.PI * rayon * rayon * rayon) / 3;
	    
	    surface = 2 * Math.PI * rayon * rayon;
	    
	    circonference = 2 * Math.PI * rayon;
	    
	    System.out.println("");
	    System.out.println("Le volume vaut : " + volume);
	    System.out.println("la surface vaut : " + surface);
	    System.out.println("la circonference vaut : " + circonference);
	   		
	}

}
