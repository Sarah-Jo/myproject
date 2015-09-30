package cm.dart.transfert;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Service {
	
private String sourceRep,destiRep;

public Service() {
	super();
}

public String getSourceRep() {
	return sourceRep;
}

public void setSourceRep(String sourceRep) {
	this.sourceRep = sourceRep;
}

public String getDestiRep() {
	return destiRep;
}

public void setDestiRep(String destiRep) {
	this.destiRep = destiRep;
}



//recuperation de tous les fichiers du dossier
public  List<Path> listFiles(Path path) throws IOException {
	List<Path> files = new ArrayList<Path>();
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
        for (Path entry : stream) {
            if (Files.isDirectory(entry)) {
                listFiles(entry);
            }else{
            	files.add(entry);
            }
            
        }
    }
    return files;
}



//calcul du prix de chaque fichier du dossier et ensuite on retourne le prix a payer
public BigDecimal prixDesFichiers(List<Path> listFichier) throws IOException{
	
	BigDecimal montant =new BigDecimal(0) ;
	BigDecimal sommeApayer=new BigDecimal(0);
	
for(Path paths:listFichier){
	
 long tailleFile=Files.size(paths);
 
 if (tailleFile<(2*1024*1024)){
	 
	 montant=new BigDecimal(25);
	 
 }else if ((tailleFile>(2*1024*1024))&&(tailleFile<(5*1024*1024*1024))){
	 montant=new BigDecimal(980.59);
	 
	 
 }else if (tailleFile>(5*1024*1024*1024)){
		montant=new BigDecimal(1500);
		
		
	}
	sommeApayer=sommeApayer.add(montant);
}
	
    return sommeApayer;
	
}



	
//transacstion des fichiers

public void transaction (List<Path> listFichier ) throws IOException{
	
	
	
	for(Path paths:listFichier){
		
	URI fichier=paths.toUri();
	Path nomDuFichier=paths.getFileName();
	Path pathFichierDes= Paths.get(this.destiRep+"/"+nomDuFichier);
	
		Path source=Paths.get(fichier); //Path du dossier source
		
		if (!Files.exists(pathFichierDes)){
			 Files.createFile(pathFichierDes);
		}
		           
		Path dest=Paths.get(this.destiRep+"/"+nomDuFichier); //Path du dossier source
	
		Files.copy(source,dest, StandardCopyOption.REPLACE_EXISTING);
		
	}
	
	}

	

}