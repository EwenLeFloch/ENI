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

public class TestEssentiel {

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
			GererFichiersMedicaux.ajouter(new FichierMedical(78, 178, "10/7", 95, 135, "probleme d'arythmie cardiaque", "Xarelto 20 mg (le soir au diner) - Bisoprolol 2.5mg (le matin au déjeuner)", LocalDate.of(2023, 3, 5), (Patient)jean, celine));
			GererFichiersMedicaux.ajouter(new FichierMedical(54, 172, "14/7", 94, 65, "probleme d'hypertension", "Perindropil 2mg (le matin au petit déjeuner) - Pantoprazole 20mg (le soir pendant le repas)", LocalDate.of(2023, 2, 17), (Patient)sophie, melanie));
			GererFichiersMedicaux.ajouter(new FichierMedical(77, 170, "15/7", 94, 70, "probleme d'hypertension", "Perindropil 2mg (le matin au petit déjeuner)", LocalDate.of(2023, 2, 25), (Patient)adhemar, edmond));

			//edition du fichier
			GererFichiersMedicaux.afficherList();
			
		} catch (UtilisateurException | ProgrammeurException e) {
			System.out.println(e.getMessage());
		}
	}
}
