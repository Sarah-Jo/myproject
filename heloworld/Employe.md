package cm.dart.heloworld;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Employe {

	private String nom;
	private	String prenom;
	private double salaire;

	public Employe(String nom, String prenom, double salaire) {
		this.nom=nom;
		this.prenom=prenom;
		this.salaire=salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public double calculSalaireAnnuel() {
		return this.salaire*12;
	}

	public double calculSalaire(double percent){
		return this.calculSalaireAnnuel()*(percent/100 +1);
	}

	public void afficherSalaire(){

		BigDecimal joelle = new BigDecimal(Double.toString(this.calculSalaireAnnuel()));
		NumberFormat sarah = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String nta = sarah.format(joelle);

		System.out.println(" salaire annuel de " + this.nom + " = " + nta);
	}

	public void afficherSalaire(double percent){
		BigDecimal joelle = new BigDecimal(Double.toString(this.calculSalaire(percent)));
		NumberFormat sarah = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String nta = sarah.format(joelle);

		System.out.println(" salaire annuel de " + this.nom + " = " + nta);
	}

}

