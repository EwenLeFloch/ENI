package test;

import java.util.*;

import bo.Animal;
import bo.Renard;

public class TesterAnimal {
	public static void main(String[] args) {
		Animal animal = new Animal("Claude le dindon", "Graine de quinoa");
		animal.crier();
		
		Renard renard = new Renard("Sonic", "Anneaux", "Bleu");
		renard.crier();
		
		List<Animal> animaux = new ArrayList<>();
		animaux.add(new Animal("Garfield", "Lasagnes"));
		animaux.add(new Renard("Tails", "Pates", "Jaune"));
		
		for (Animal current : animaux) {
			current.crier();
		}
	}
	
}
