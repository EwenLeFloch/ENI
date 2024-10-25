package eni.demo;

public class Personne {

	private String nom;
	private String prenom;
	
	
	public Personne() {
		
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom.toUpperCase();
	}
	public void setNom(String nom) {
		if (nom!=null) {
		this.nom = nom;
		}
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
