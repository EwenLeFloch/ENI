package fr.eni.quelmedecin.test;

import java.time.LocalDate;

import fr.eni.quelmedecin.bo.Adresse;
import fr.eni.quelmedecin.bo.FichierMedical;
import fr.eni.quelmedecin.bo.GererFichiersMedicaux;
import fr.eni.quelmedecin.bo.Medecin;
import fr.eni.quelmedecin.bo.MedecinGeneraliste;
import fr.eni.quelmedecin.bo.MedecinSpecialiste;
import fr.eni.quelmedecin.bo.Patient;
import fr.eni.quelmedecin.bo.Personne;
import fr.eni.quelmedecin.bo.Remboursement;
import fr.eni.quelmedecin.bo.Specialite;
import fr.eni.quelmedecin.exception.ProgrammeurException;
import fr.eni.quelmedecin.exception.UtilisateurException;

public class TestAvance {

	public static void main(String[] args) {
		Personne sophie= null, jean=null, adhemar=null;
		Medecin melanie= null, edmond=null, celine=null;
		
		try {
			System.out.println("__________________________ Patients ______________________________");
			jean = new Patient("Dupond", "Jean", "0753428619",'M', 1921121920201l, LocalDate.of(1992, 11, 21), null, new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort"));
			adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 1950661517002l, LocalDate.of(1995, 06, 10), null, new Adresse(null, 18, "B", "rue des Fleurs", 17000, "La Rochelle"));
			sophie = new Patient("Durant", "Sophie", "0751322412", 'F', 1041078217038l, LocalDate.of(2004, 10, 21), null, new Adresse(215, null, "avenue de Paris", 79000, "Niort"));

			System.out.println("__________________________ Médecins géneralistes ______________________________");
			melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "0228031728", new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain"));
			melanie.setRemboursement(Remboursement.TFCM1);
		
			System.out.println("__________________________ Médecins spécialistes ______________________________");
			edmond = new MedecinSpecialiste("Bosapin", "Edmond", "0228031724", new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain"), Specialite.ANGIO, 90);
			edmond.setRemboursement(Remboursement.TVCM2);
			celine = new MedecinSpecialiste("OCENSEMAIME", "Céline", "0228031721", new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain"), Specialite.CARDIO, 85);
			celine.setRemboursement(Remboursement.TVCM2);
			
			System.out.println("__________________________ Collection de type ArrayList des données de type FichierMedical ______________________________");
			GererFichiersMedicaux.ajouter(new FichierMedical(54, 172, "15/7", 94, 95, "probleme d'hypertension", "Ramipril 20mg (le matin au petit déjeuner)", LocalDate.of(2023, 1, 21), (Patient)sophie, melanie));
			GererFichiersMedicaux.ajouter(new FichierMedical(54, 172, "15/7", 94, 95, "probleme d'hypertension", "Ramipril 20mg (le matin au petit déjeuner)", LocalDate.of(2023, 2, 11), (Patient)sophie, melanie));
			GererFichiersMedicaux.ajouter(new FichierMedical(54, 172, "15/7", 95, 135, "probleme d'arythmie cardiaque", "Xarelto 20 mg (le soir au diner) - Bisoprolol 2.5mg (le matin au déjeuner)", LocalDate.of(2023, 3, 5), (Patient)sophie, celine));
			GererFichiersMedicaux.ajouter(new FichierMedical(77, 170, "15/7", 94, 70, "probleme d'hypertension", "Perindropil 2mg (le matin au petit déjeuner)", LocalDate.of(2023, 3, 15), (Patient)sophie, edmond));

			GererFichiersMedicaux.ajouter(new FichierMedical(54, 172, "15/7", 95, 135, "probleme d'arythmie cardiaque", "Xarelto 20 mg (le soir au diner) - Bisoprolol 2.5mg (le matin au déjeuner)", LocalDate.of(2023, 2, 12), (Patient)jean, celine));
			GererFichiersMedicaux.ajouter(new FichierMedical(77, 170, "15/7", 94, 70, "probleme d'hypertension", "Perindropil 2mg (le matin au petit déjeuner)", LocalDate.of(2023, 2, 15), (Patient)adhemar, edmond));

			System.out.println("==============================================");
			System.out.println("=                  1ere PARTIE               =");
			System.out.println("==============================================");
			GererFichiersMedicaux.afficherList();


			System.out.println("==============================================");
			System.out.println("=                  2eme PARTIE               =");
			System.out.println("==============================================");
			GererFichiersMedicaux.ajouterMap();
			GererFichiersMedicaux.afficherMap();
			
		} catch (UtilisateurException | ProgrammeurException e) {
			System.out.println(e.getMessage());
		}
	}
}