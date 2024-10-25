package eni.demo;

import java.time.LocalDate;

public class Personne {
	private String prenom;
	private String nom;
	private LocalDate birthday;
	private long numSecu;
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
	}
	public Personne(String prenom, String nom, LocalDate birthday) {
		this(prenom, nom);
		this.birthday = birthday;
	}
	
	public Personne(String prenom, String nom, LocalDate birthday, long numSecu) {
		this(prenom, nom, birthday);
		this.setNumSecu(numSecu);
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public long getNumSecu() {
		return numSecu;
	}
	public void setNumSecu(long numSecu) {
		this.numSecu = numSecu;
	}
	
	
}
