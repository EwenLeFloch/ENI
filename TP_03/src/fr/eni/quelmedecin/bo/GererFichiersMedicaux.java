package fr.eni.quelmedecin.bo;
 
import java.util.ArrayList;
import java.util.List;
 
public class GererFichiersMedicaux {
	private static List<FichierMedical> FichiersMedicaux = new ArrayList<>();
	
	public static void ajouter(FichierMedical fichierMedical) {
		FichiersMedicaux.add(fichierMedical);
	}
 
	public static void afficherList() {
		for (FichierMedical fichierMedical : FichiersMedicaux) {
			System.out.println("Fichier médical de : ");
			System.out.println(fichierMedical + "\n");
		}
	}
	
	
}
