package cm.dart.heloworld;

import java.util.Scanner;

public class TestEmploye {
	public static void main(String[] arg) {

		Scanner read = new Scanner(System.in);
		System.out.println("*****Test Employe*****");
		System.out.println("Entrez le nom de l'employe 1");
		String nom1 = read.nextLine();

		System.out.println("Entrez le prenom de l'employe 1");
		String prenom1 = read.nextLine();

		System.out.println("Entrez le salaire de l'employe 1");
		double salaire1 = read.nextDouble();
		read.nextLine();
		Employe patrick = new Employe(nom1, prenom1, salaire1);
		System.out.println("Entrez le nom de l'employe 2");
		String nom2 = read.nextLine();

		System.out.println("Entrez le prenom de l'employe 2");
		String prenom2 = read.nextLine();

		System.out.println("Entrez le salaire de l'employe 2");
		double salaire2 = read.nextDouble();
		
		Employe john = new Employe(nom2, prenom2, salaire2);
		
		System.out.print("Le");
		patrick.afficherSalaire();
		
		System.out.print("Le");
		john.afficherSalaire(); 
		
		System.out.println("Entrez un pourcentage");
		double percent= read.nextDouble();
		System.out.print("Le nouveau");
		john.afficherSalaire(percent);
		
		System.out.print("Le nouveau");
		patrick.afficherSalaire(percent);
		
	}
}

