package cm.dart.hellooworld;

import java.math.*;
import java.util.Scanner;

public class PairOuImpair {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int num=6;
		
		System.out.print("Entrez un nombre entier : ");
		num = input.nextInt();
		
		if(num%2 != 0)
		{
            System.out.println("Le nombre est impair ");
		}
        else if (num%2 == 0){
        	System.out.print("Le nombre est pair");
            }
            	
            

	}

}
