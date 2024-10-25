package fr.eni.quelmedecin.bo;

import java.time.LocalDate;

public class FichierMedical {
	private int poids;
	private int taille;
	private String tension;
	private int oxygenation;
	private int pulsation;
	private String probleme;
	private String prescription;
	private LocalDate dateSoin;
	private Patient patient;
	private Medecin medecin;

	public FichierMedical(int poids, int taille, String tension, int oxygenation, int pulsation, String probleme,
			String prescription, LocalDate dateSoin, Patient patient, Medecin medecin) {

		this.poids = poids;
		this.taille = taille;
		this.tension = tension;
		this.oxygenation = oxygenation;
		this.pulsation = pulsation;
		this.probleme = probleme;
		this.prescription = prescription;
		this.dateSoin = dateSoin;
		this.patient = patient;
		this.medecin = medecin;
	}

	@Override
	public String toString() {
		String afficher = patient.toString();
		afficher += "\nPoids : " + poids + "kg, taille : " + taille + " cm\n";
		afficher += "Tension : " + tension + "cmHg, saturation : " + oxygenation + "%, pulsation : " + pulsation + "\n";
		afficher += "Problème : " + probleme + "\n";
		afficher += "Prescription : " + prescription + "\n";
		afficher += "Date de soin : " + dateSoin + "\n";
		
		afficher += "Médecin " + medecin.recupererDomaine() + " responsable : " + medecin;
//		if (medecin instanceof MedecinGeneraliste)
//			afficher += "Le médecin généraliste responsable : ";
//		else if (medecin instanceof MedecinSpecialiste)
//			afficher += "Le médecin spécialiste responsable : ";
				
//		afficher += medecin;
		return afficher;
	}

	public String affichageSpécifique(Medecin medecin) {
		return medecin.toString();
	}

	public int getPoids() {
		return poids;
	}

	public int getTaille() {
		return taille;
	}

	public String getTension() {
		return tension;
	}

	public int getOxygenation() {
		return oxygenation;
	}

	public int getPulsation() {
		return pulsation;
	}

	public String getProbleme() {
		return probleme;
	}

	public String getPrescription() {
		return prescription;
	}

	public LocalDate getDateSoin() {
		return dateSoin;
	}

	public Patient getPatient() {
		return patient;
	}

	public Medecin getMedecin() {
		return medecin;
	}

}
