package bo;

public final class Renard extends Animal {
	private String couleur;
	
	public Renard() {
		super(); // possible mais pas obligatoire
	}
	
	public Renard(String nom, String repasPrefere, String couleur) {
		// Utilisation du constructeur de Animal
		super(nom, repasPrefere);
		this.couleur = couleur;
	}

	@Override
	public void crier() {
		// Appel à la méthode crier de Animal
		super.crier();
		System.out.println("Ring ding ding");
	}

	@Override
	public String toString() {
		return "Renard [couleur=" + couleur + "]";
	}
	
	public String getCouleur() {
		return couleur;
	}
}
