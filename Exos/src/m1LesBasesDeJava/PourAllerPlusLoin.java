package m1LesBasesDeJava;

import java.util.Random;
import java.util.Scanner;

public class PourAllerPlusLoin {
	public static void main(String[] args) {
		
		/*
		 * L'exercice ici consiste à créer un jeu de
		 * Poule - Renard - Vipère
		 * 
		 * Le programme tire au hasard la valeur "Poule",
		 * "Renard" ou "Vipère" sans l'indiquer au joueur
		 * 
		 * Le programme demande ensuite au joueur si il veut 
		 * jouer "Poule", "Renard" ou "Vipère"
		 * 
		 * Le programme indique ensuite au joueur si
		 * il a gagné, perdu ou bien égalité
		 * 
		 * Pour rappel : 
		 *  - La Poule bat la Vipère
		 *  - La Vipère bat le renard
		 *  - Le Renard bat la Poule
		 *  
		 *  (oui, ça fait beaucoup de "if" !)
		 *  
		 *  Pour aller encore plus loin : proposez au joueur un petit menu pour rejouer !
		 */
		
		Random random = new Random();
		
		
		String choix;
		Scanner sc = new Scanner(System.in);
		int yourAnimal = -1;
		do {
		System.out.println("Voulez-vous jouer Poule, Renard ou Vipère ?");
		int animal = random.nextInt(3);
		choix = sc.nextLine().toLowerCase();
		if (choix.equalsIgnoreCase("stop") || choix.equalsIgnoreCase("non"))
			break;
		switch (choix) {
			case "poule" :  yourAnimal = 0;
			break;
			case "renard" : yourAnimal = 1;
			break;
			case "vipère" : yourAnimal = 2;
			break;
			default : System.out.println("Je n'ai pas compris votre animal");
			continue;
		}
		
		System.out.println(winner(animal, yourAnimal));}
		while (true);
		sc.close();
		
	}
	
	private static String winner(int animal, int yourAnimal) {
		if (animal == yourAnimal) {
			return "Egalité !";
		}
		switch (animal) {
			case 0 : return yourAnimal == 1 ? "Gagné !" : "Perdu !";
			case 1 : return yourAnimal == 2 ? "Gagné !" : "Perdu !";
			case 2 : return yourAnimal == 0 ? "Gagné !" : "Perdu !";
		}
		return "Choisissez un animal";
	}


}
