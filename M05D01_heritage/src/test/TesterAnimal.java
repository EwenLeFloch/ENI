package test;

import java.util.ArrayList;
import java.util.List;

import bo.Animal;
import bo.Renard;

public class TesterAnimal {
	public static void main(String[] args) {
		// polymorphisme();
		
		// equalsAndToString();
		
		transtypage();
	}
	
	private static void transtypage() {
		// transtypage ascendant --> je perds de l'information
		Animal tails = new Renard("Tails", "Pates", "Jaune");
		Renard rox = new Renard("Rox", "Pâtée", "Orange");
		
		// System.out.println(tails.getCouleur());
		System.out.println(rox.getCouleur());
		
		// transtypage descendant --> je récupère l'information
		if (tails instanceof Renard) {
			Renard tailsAsRenard = (Renard) tails;
			System.out.println(tailsAsRenard.getCouleur());
		}
		
		System.out.println(tails);
		System.out.println(rox.toString());
	}
	
	/*
	 * equals et hashCode sont utilisées pour comparer 2 instances de classe.
	 */
	private static void equalsAndToString() {
		Animal animal = new Animal("Claude le dindon", "Graine de quinoa");
		System.out.println(animal);
		
		Animal animal2 = new Animal("Claude le dindon", "Graine de quinoa");
		
		System.out.println(animal == animal2); // pas bien
		System.out.println(animal.equals(animal2)); // bien
		
		System.out.println(animal.equals(animal));
		
		System.out.println(animal.hashCode());
		System.out.println(animal2.hashCode());
		
	}

	private static void polymorphisme() {
		Animal animal = new Animal("Claude le dindon", "Graine de quinoa");
		animal.crier();
		
		Renard renard = new Renard("Sonic", "Anneaux", "Bleu");
		renard.crier();
		
		List<Animal> animaux = new ArrayList<>();
		animaux.add(new Animal("Garfield", "Lasagnes"));
		animaux.add(new Renard("Tails", "Pates", "Jaune"));
		
		/*
		 * Polymorphisme : Java utilise toujours la méthode
		 * la plus précise à sa disposition.
		 */
		for (Animal current : animaux) {
			current.crier();
			current.manger();
		}
	}
}






