package fr.eni.quelmedecin.bo;

import java.time.LocalTime;

import fr.eni.quelmedecin.exception.ProgrammeurException;
import fr.eni.quelmedecin.exception.UtilisateurException;

public class Creneau {
	private LocalTime time;
	private int minutes;
	private Medecin medecin;

	public Creneau(LocalTime time, int minutes, Medecin medecin) throws UtilisateurException, ProgrammeurException {
		this.time = time;
		this.minutes = minutes;
		setMedecin(medecin);
		medecin.addCreneau(this);
	}

//	public void afficher() {
//		System.out.println(time + " - " + (time.plusMinutes(minutes)) + " (" + minutes + " minutes)");
//	}
	@Override
	public String toString() {
		String afficher = "";
		afficher += time + " - " + (time.plusMinutes(minutes)) + " (" + minutes + " minutes)\n";
		return afficher;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) throws ProgrammeurException {
		if (medecin == null)
			throw new ProgrammeurException("Instance de type Medecin inexistante");
		this.medecin = medecin;
	}

}
