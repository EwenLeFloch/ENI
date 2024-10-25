package fr.eni.quelmedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import fr.eni.quelmedecin.exception.ProgrammeurException;
import fr.eni.quelmedecin.exception.UtilisateurException;

public class Patient extends Personne {
	private char sexe;
	private long numSecu;
	private LocalDate ddn;
	private String commentaires;

	public Patient(String nom, String prenom, String telephone, char sexe, long numSecu, LocalDate ddn,
			String commentaires, Adresse adresse) throws UtilisateurException, ProgrammeurException {
		super(nom, prenom, telephone, adresse);
		setSexe(sexe);
		setNumSecu(numSecu);
		setDdn(ddn);
		this.commentaires = commentaires;
	}

//	public void afficher() {
//		var dtf = DateTimeFormatter.ofPattern("d MMMM Y", Locale.FRENCH);
//		super.afficher();
//		System.out.println("Sexe : " + this.getSexe());
//		System.out.println("Numéro de sécurité sociale : " + numSecu);
//		System.out.println("Date de naissance : " + ddn.format(dtf));
//		System.out.println("Commentaires : " + (commentaires != null ? commentaires : "[aucun commentaire]"));
//	}

	@Override
	public String toString() {
		String afficher = super.toString();
		var dtf = DateTimeFormatter.ofPattern("d MMMM Y", Locale.FRENCH);
		afficher += "Sexe : " + this.getSexe() + "\n";
		afficher += "Numéro de sécurité sociale : " + numSecu + "\n";
		afficher += "Date de naissance : " + ddn.format(dtf) + "\n";
		afficher += "Commentaires : " + (commentaires != null ? commentaires : "[aucun commentaire]");
		return afficher;
	}

	public String getSexe() {
		return sexe == 'F' ? "Féminin" : "Masculin";
	}

	public void setSexe(char sexe) throws UtilisateurException {
		sexe = Character.toUpperCase(sexe);
		if (sexe != 'F' && sexe != 'M')
			throw new UtilisateurException("Le sexe doit être 'F' pour féminin ou 'M' pour masculin");
		this.sexe = sexe;
	}

	public long getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(long numSecu) throws UtilisateurException {
		if ((numSecu +"").length() != 13)
			throw new UtilisateurException("Le numéro de sécurité sociale est obligatoire et doit comporter 13 caractères");
		this.numSecu = numSecu;
	}

	public LocalDate getDdn() {
		return ddn;
	}

	public void setDdn(LocalDate ddn) throws UtilisateurException {
		if (ddn == null)
			throw new UtilisateurException("La date de naissance est obligatoire");
		if (!ddn.isBefore(LocalDate.now()))
			throw new UtilisateurException("La date de naissance doit être inférieur à celle d'aujourd'hui");
		if (!ddn.isAfter(LocalDate.of(1900, 01, 01)))
			throw new UtilisateurException("La date de naissance doit être supérieur au 01/01/1900");
		this.ddn = ddn;
	}

	public String getCommentaires() {

		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

}
