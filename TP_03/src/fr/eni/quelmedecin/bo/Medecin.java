package fr.eni.quelmedecin.bo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.eni.quelmedecin.exception.ProgrammeurException;
import fr.eni.quelmedecin.exception.UtilisateurException;

public abstract class Medecin extends Personne implements Soigner {
	List<Creneau> creneaux = new ArrayList<Creneau>();
	private Remboursement remboursement;

	public Medecin(String nom, String prenom, String telephone, Adresse adresse, Remboursement remboursement) throws UtilisateurException, ProgrammeurException {
		super(nom, prenom, telephone, adresse);
		setRemboursement(remboursement);
		
	}
	

	public Medecin(String nom, String prenom, String telephone, Adresse adresse)
			throws UtilisateurException, ProgrammeurException {
		super(nom, prenom, telephone, adresse);
	}


	public void addCreneau(Creneau creneau) throws UtilisateurException {
		if (creneaux.size() == 15)
			throw new UtilisateurException("Trop de créneaux sont affectés à ce médecin");
		creneaux.add(creneau);
	}

	public String recupererDomaine() {
		return null;
	}
	public String payer() {
		 double remboursementSecu = getTarif()*remboursement.getTauxSecu();
		 double remboursementMutuelle = remboursement.name()== "NCM2" ? getTarif()*remboursement.getTauxMutuelle() : remboursementSecu*remboursement.getTauxMutuelle();
		return ("remboursement Assurance Maladie : "
				+ remboursementSecu
				+ " - remboursement Mutuelle : "
				+ remboursementMutuelle
				+ " - reste à charge : "
				+ (getTarif()-remboursementSecu-remboursementMutuelle));
	}

//	public void afficher() {
//		super.afficher();
//	}
	@Override
	public String toString() {
		String afficher = super.toString();
		afficher += afficherCreneaux() + "\n"; 
		afficher += "Spéciliaté : " + MedecinSpecialiste.getSpecialite().getLibelle() + "\n";
		afficher += "Tarif : " + getTarif() + "€\n";
		afficher += payer();
//		afficher += getRemboursement().getLibelle();

		return afficher;
	}

	public String afficherCreneaux() {
		String afficher = "";

		if (creneaux.isEmpty()) {
			afficher += "Aucun créneau";
			return afficher;
		}

		for (Creneau creneau : creneaux) {

			afficher += creneau.toString();

		}

		return "Créneaux : \n" + afficher;

	}

	public List<Creneau> getCreneaux() {
		return Collections.unmodifiableList(creneaux);
	}
	
	

	public Remboursement getRemboursement() {
		return remboursement;
	}

	public void setRemboursement(Remboursement remboursement) {
		this.remboursement = remboursement;
	}

	public abstract int getTarif();

	public abstract void setTarif(int tarif) throws UtilisateurException;
}
