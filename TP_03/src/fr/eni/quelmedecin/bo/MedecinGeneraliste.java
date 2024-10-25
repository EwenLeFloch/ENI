package fr.eni.quelmedecin.bo;

import fr.eni.quelmedecin.exception.ProgrammeurException;
import fr.eni.quelmedecin.exception.UtilisateurException;

public class MedecinGeneraliste extends Medecin implements Soigner {
	static int tarif = 25;

	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse, Remboursement remboursement) throws UtilisateurException, ProgrammeurException{
		super(nom, prenom, telephone, adresse, remboursement);
	}

public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) throws UtilisateurException, ProgrammeurException {
	super(nom, prenom, telephone, adresse);
	}

	//	public void afficher() {
//		super.afficher();
//		System.out.println("Tarif : " + tarif + "€");
//	}
	@Override
	public String recupererDomaine() {
		return "généraliste";
	}

	@Override
	public String toString() {
		String afficher = super.toString();
		return afficher;
	}

	@Override
	public int getTarif() {
		return tarif;
	}
	public static int recupererTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	@Override
	public void orienter() {
		System.out.println("Le médecin oriente vers un spécialiste en cas de besoin");

	}

}
