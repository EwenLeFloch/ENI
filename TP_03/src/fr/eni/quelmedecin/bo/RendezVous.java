package fr.eni.quelmedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fr.eni.quelmedecin.exception.ProgrammeurException;
import fr.eni.quelmedecin.exception.UtilisateurException;

public class RendezVous {
	private Creneau creneau;
	private Patient patient;
	private LocalDate date;

	public RendezVous(Creneau creneau, Patient patient, LocalDate date) throws UtilisateurException, ProgrammeurException {
		setCreneau(creneau);
		setPatient(patient);
		setDate(date);
	}

//	public void afficher() {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM Y");
//		System.out.print("Rendez-vous du " + date.format(formatter) + " ");
//		creneau.afficher();
//		System.out.println("Avec le Dr " + creneau.getMedecin().getNom());
//		System.out.print("pour ");
//		patient.afficher();
//	}
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM Y");
		String afficher = "Rendez-vous du " + date.format(formatter) + " ";
		afficher += creneau;
		afficher += "Avec le Dr " + creneau.getMedecin().getNom() + "\n";
		afficher += "pour ";
		afficher += patient;
		return afficher;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) throws ProgrammeurException {
		if (creneau == null )
			throw new ProgrammeurException("Instance de type Creneau inexistante");
		this.creneau = creneau;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) throws ProgrammeurException {
		if (patient == null)
			throw new ProgrammeurException("Instance de type Patient inexistante");
		this.patient = patient;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) throws UtilisateurException {
		if (date.isBefore(LocalDate.now()))
			throw new UtilisateurException("La date de Rendez-vous ne peut pas être antérieur à la date du jour");
		this.date = date;
	}
	

}
