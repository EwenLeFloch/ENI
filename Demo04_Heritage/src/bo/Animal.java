package bo;

public class Animal {
	private String nom;
	private String repasPrefere;
	
	public Animal(String nom, String repasPrefere) {
		this.nom = nom;
		this.repasPrefere = repasPrefere;
	}
	
	public void crier() {
		System.out.println("Je suis un animal qui s'appelle " + nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRepasPrefere() {
		return repasPrefere;
	}

	public void setRepasPrefere(String repasPrefere) {
		this.repasPrefere = repasPrefere;
	}
	
	
	
	
}
