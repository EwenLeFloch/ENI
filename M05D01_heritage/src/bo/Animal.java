package bo;

import java.util.Objects;

// Héritage implicite de Object si aucun extends n'est précisé.
public class Animal /*extends Object*/ {
	private String nom;
	private String repasPrefere;
	
	public Animal() {}
	
	public Animal(String nom, String repasPrefere) {
		this.nom = nom;
		this.repasPrefere = repasPrefere;
	}
	
	public void crier() {
		System.out.println("Je suis un animal qui s'appelle " + nom);
	}
	
	public void manger() {
		System.out.println("Miam miam les bonnes " + repasPrefere);
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
	
	@Override
	public int hashCode() {
		return Objects.hash(nom, repasPrefere);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj; // cast
		return Objects.equals(nom, other.nom) && Objects.equals(repasPrefere, other.repasPrefere);
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", repasPrefere=" + repasPrefere + "]";
	}
	
	
}
