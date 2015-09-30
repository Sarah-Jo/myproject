package cm.dart.transfert;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
        Scanner sc =new Scanner(System.in);
        
        //creation instance d'un client
		System.out.println("entrez votre nom");
        String nom=sc.nextLine();
        System.out.println("entrez votre prenom");
        String prenom=sc.nextLine();
        Client client=new Client();
        client.setNom(nom);
        client.setPrenom(prenom);
        
        //creation d'une instance de service
        System.out.println("entrez le chemin du dossier source");
        String source=sc.nextLine();
        System.out.println("entrez le chemin du dossier destination");
        String destination=sc.nextLine();
        Service service=new Service();
		service.setSourceRep(source);
		service.setDestiRep(destination);
		
		
		//creation du path de la source
		
		List<Path> listeFichier = null;
		try {
			Path path=Paths.get(service.getSourceRep());
			listeFichier = service.listFiles(path);
			for(Path pathss:listeFichier){
				System.out.println(pathss);
				}
			} catch (IOException e) {
			System.out.print("verifiez le chemin de votre dossier source :");
			System.out.println(" "+e.getMessage());
		}
		
		
		
		BigDecimal prix = null;
		try {
			prix = service.prixDesFichiers(listeFichier);
			System.out.print("cher(e) client "+client.getNom()); 
			System.out.println(" "+client.getPrenom()+" votre facture est: "+prix);
		} catch (IOException e1) {
			System.out.println("le chemin de votre dossier est n'existe pas");
			
	}
		
		
		System.out.println("appuyer sur la touche o pour confirmer le transfert");
		String conf=sc.nextLine();
		
		if (conf.equals("o")){
			
			System.out.println("entrez le montant de votre facture");
			double paies=sc.nextDouble();
			BigDecimal paie=new BigDecimal(paies);
			
			
			if (paie.equals(prix)){
				
				try {
					
					LocalDateTime debutCopy=LocalDateTime.now();
					service.transaction(listeFichier);
					
					LocalDateTime finCopy=LocalDateTime.now();
					Duration dureeCopy=Duration.between(debutCopy, finCopy);
					System.out.println("transfert effectue avec une duree de "+dureeCopy.toMillis()+" milliseconde(s)");
					
					
					
					
				} catch (IOException e) {
					System.out.print("verifier le chemin de votre dossier de destination :");
					System.out.println(" "+e.getMessage());
				}
				
			}else{
				System.out.println("le montant entrez est inferieur a la facture");
			}
			
			
			
		}else{
		System.out.println("MERCI");
		
		}
	}


	
}