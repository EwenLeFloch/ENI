package fr.eni.quelmedecin.bo;

import java.util.Comparator;

import fr.eni.quelmedecin.exception.ProgrammeurException;
import fr.eni.quelmedecin.exception.UtilisateurException;

public abstract class Personne {
	private String nom;
	private String prenom;
	private String telephone;
	private Adresse adresse;
	public static Comparator<Personne> comparatorNomPrenomCroissant = new Comparator<Personne>() {
		public int compare(Personne p1, Personne p2) {
			// TODO Auto-generated method stub
			int compare = p1.getNom().compareTo(p2.getNom());
			if (compare != 0)
				return compare;
			else
				return p1.getPrenom().compareTo(p2.getPrenom());
		}
	};

	public Personne(String nom, String prenom, String telephone, Adresse adresse)
			throws UtilisateurException, ProgrammeurException {
		setNom(nom);
		setPrenom(prenom);
		setTelephone(telephone);
		setAdresse(adresse);

	}

//	public void afficher() {
//		System.out.println(nom.toUpperCase() + " " + prenom);
//		System.out.println("Téléphone : " + telephone);
//		System.out.println("Adresse :");
//		getAdresse().afficher();
//	}
	@Override
	public String toString() {
		String afficher = getNom() + " " + getPrenom() + "\n";
		afficher += "Téléphone : " + getTelephone() + "\n";
		afficher += "Adresse : " + getAdresse().toString() + "\n";
		return afficher;
	}

	public String getNom() {
		return nom.toUpperCase();
	}

	public void setNom(String nom) throws UtilisateurException {
		if (nom == null || nom == "")
			throw new UtilisateurException("Le nom est obligatoire");
		if (nom.length() < 1)
			throw new UtilisateurException("Le nom doit comporter plus de 1 caractère");
		if (nom.length() > 100)
			throw new UtilisateurException("Le nom doit comporter moins de 100 caractères");
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) throws UtilisateurException {
		if (prenom == null || prenom == "")
			throw new UtilisateurException("Le prénom est obligatoire");
		if (prenom.length() < 1)
			throw new UtilisateurException("Le prénom doit comporter plus de 1 caractère");
		if (prenom.length() > 100)
			throw new UtilisateurException("Le prénom doit comporter moins de 100 caractères");
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) throws UtilisateurException {
		if (telephone != null && telephone.length() != 10)
			throw new UtilisateurException("Le numéro de téléphone doit comporter 10 chiffres");
		this.telephone = telephone;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) throws ProgrammeurException {
		if (adresse == null)
			throw new ProgrammeurException("instance de type Adresse inexistante");
		this.adresse = adresse;
	}

	public Comparator<Personne> getComparatorNomPrenomCroissant() {
		return comparatorNomPrenomCroissant;
	}

}
