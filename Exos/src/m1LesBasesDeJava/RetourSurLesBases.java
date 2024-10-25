package m1LesBasesDeJava;

public class RetourSurLesBases {
	
	public static void main(String[] args) {
		exercice1();
		exercice2();
		exercice3();
		exercice4();
	}

	private static void exercice1() {
		/*
		 * facile
		 * Créez une fonction qui prend deux entiers en paramètre
		 * et restitue leur somme
		 */
		
		System.out.println(somme(12, 13));
		
	}
	static int somme(int entier1, int entier2) {
			return entier1 + entier2;
		}
	
	private static void exercice2() {
		/*
		 * moyen
		 * créez une fonction qui prend un tableau en paramètre
		 * et qui affiche chacun de ses éléments à la ligne
		 */
		int[] tableau = {5, 8, 4, 9, 2, 1, 7};
		displayValues(tableau);
		
	}
	private static void displayValues(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}
	}
	
	private static void exercice3() {
		/*
		 * moyen
		 * créez une fonction qui prend un tableau en paramètre
		 * et qui double toutes les valeurs de ce tableau
		 * Vous pouvez utiliser la fonction créée à l'exercice 2
		 * pour consulter les valeurs
		 */
		int[] tableau = {5, 8, 4, 9, 2, 1, 7};
		doubleValues(tableau);
		displayValues(tableau);
	}
	private static int[] doubleValues(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] *= 2;
		}
		return tableau;
	}
	
	private static void exercice4() {
		/*
		 * corsé
		 * Créez une fonction qui prend deux entiers en paramètre
		 * et restitue la puissance de l'un par rapport à l'autre
		 * Par exemple : puissance(5, 2) --> 5² = 25
		 */
		System.out.println(power(8, 6));
	}
	private static int power(int entier, int power) {
		return (int) Math.pow(entier, power);
	}
}
