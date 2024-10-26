package fr.eni.quelmedecin.bo;


import fr.eni.quelmedecin.exception.ProgrammeurException;
import fr.eni.quelmedecin.exception.UtilisateurException;

public class MedecinSpecialiste extends Medecin implements Comparable<MedecinSpecialiste>, Soigner {
	private int tarif;
	private static Specialite specialite;

	public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse, Specialite specialite,
			int tarif, Remboursement remboursement)
			throws UtilisateurException, ProgrammeurException {
		super(nom, prenom, telephone, adresse, remboursement);
		setSpecialite(specialite);
		setTarif(tarif);
	}

	public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse, Remboursement remboursement)
			throws UtilisateurException, ProgrammeurException {
		super(nom, prenom, telephone, adresse, remboursement);
	}
	
	

	public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse,Specialite specialite,
			int tarif) throws UtilisateurException, ProgrammeurException {
		super(nom, prenom, telephone, adresse);
		setSpecialite(specialite);
		setTarif(tarif);
	}

	@Override
	public int compareTo(MedecinSpecialiste other) {
		// TODO Auto-generated method stub
		return this.tarif - other.tarif;
	}

	@Override
	public void orienter() {
	}

//	public void afficher() {
//		super.afficher();
//		System.out.println("Spécialité : " + specialite);
//		System.out.println("Tarif : " + tarif + "€");
//	}

	@Override
	public String recupererDomaine() {
		return "spécialiste";
	}

	@Override
	public String toString() {
		String afficher = super.toString();
//		afficher += "\nSpécialité : " + specialite.getLibelle() + " - Situation : " + specialite.getSituationGeo();
		return afficher;
	}

	public static Specialite getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialite specialite) throws UtilisateurException {
		if (specialite == null)
			throw new UtilisateurException("La spécialité est obligatoire");
		MedecinSpecialiste.specialite = specialite;
	}

	@Override
	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) throws UtilisateurException {
		if (tarif < MedecinGeneraliste.recupererTarif())
			throw new UtilisateurException("Le tarif doit être supérieur à " + MedecinGeneraliste.recupererTarif());
		this.tarif = tarif;
	}

}
