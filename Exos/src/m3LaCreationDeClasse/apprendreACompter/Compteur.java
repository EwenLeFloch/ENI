package m3LaCreationDeClasse.apprendreACompter;

/*
 * La classe Compteur consiste en un compteur répondant aux règles suivantes :
 *  - un compteur représente un nombre commençant à 0
 *  - il est possible d'augmenter ce nombre, uniquement de 1 en 1
 *  - il est possible de remettre le compteur à 0
 *  - il est impossible de diminuer le compteur (hors remise à 0)
 *  - il est possible de consulter la valeur du compteur a tout moment
 */
public class Compteur {
	private int number = 0;
	

	public Compteur() {
	}

	public void incremente(int limite) {
		while (number < limite) {
			number++;
		}
	}

	public void reset() {
		number = 0;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
