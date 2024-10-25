package fr.eni.quelmedecin.bo;

import fr.eni.quelmedecin.exception.UtilisateurException;

public class Adresse {
	private String complement;
	private int numero;
	private String complementNumero;
	private String rue;
	private int codePostale;
	private String ville;

	public Adresse(int numero, String complementNumero, String rue, int codePostale, String ville) throws UtilisateurException {

		setNumero(numero);
		this.complementNumero = complementNumero;
		setRue(rue);
		setCodePostale(codePostale);
		setVille(ville);

	}

	public Adresse(String complement, int numero, String complementNumero, String rue, int codePostale, String ville) throws UtilisateurException {
		this(numero, complementNumero, rue, codePostale, ville);
		this.complement = complement;
	}

//	public void afficher() {
//		if (complement != null && !complement.isBlank())
//			System.out.println(complement);
//		System.out.println(numero + (complementNumero != null ? complementNumero : "")  + " " + rue);
//		System.out.printf("%05d %s%n", codePostale, this.getVille());
//	}
//	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String afficher = "";
		if (complement != null && !complement.isBlank())
			afficher += complement + "\n";
		afficher += numero + (complementNumero != null ? complementNumero : "") + " " + rue + "\n";
		afficher += String.format("%05d %s", codePostale, this.getVille());
		return afficher;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public int getNumero() {

		return numero;
	}

	public void setNumero(int numero) throws UtilisateurException {
		if (numero < 1)
			throw new UtilisateurException("Le numéro de la voie doit être strictement positif");
		this.numero = numero;
	}

	public String getComplementNumero() {
		return complementNumero;
	}

	public void setComplementNumero(String complementNumero) {
		this.complementNumero = complementNumero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) throws UtilisateurException {
		if(rue == null || rue.isBlank())
			throw new UtilisateurException("Le nom de la rue est obligatoire");
		this.rue = rue;
	}

	public int getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(int codePostale) throws UtilisateurException {
		if (codePostale < 1000 || codePostale > 99999)
			throw new UtilisateurException("Le code postale doit être compris entre 1000 et 99999");
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville.toUpperCase();
	}

	public void setVille(String ville) throws UtilisateurException {
		if(ville == null || ville.isBlank())
			throw new UtilisateurException("Le nom de la ville est obligatoire");
		this.ville = ville;
	}

}
