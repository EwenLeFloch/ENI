package bo;

public class Renard extends Animal {
	private String couleur;

	public Renard(String nom, String repasPrefere, String couleur) {
		//Utilisation du constructeur Animal
		super(nom, repasPrefere);
		this.couleur = couleur;
		
	}

	@Override
	public void crier() {
		// Appel à la méthode crier de Animal
		super.crier();
		System.out.println("Ring ding ding");
	}
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}
