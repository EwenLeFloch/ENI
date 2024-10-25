package m3LaCreationDeClasse.deZeroEnHeros;

public class BatailleDeHeros {
	public static void main(String[] args) {
		/*
		 * Créez la classe Heros.
		 * Un Heros est défini par les attributs suivants : 
		 *  - un nom (String)
		 *  - un montant de point de vie (int)
		 *  - un montant d'attaque (int)
		 *  
		 * Un Heros dispose des methodes suivantes :
		 *  - estVivant() : boolean --> retourne true si les points de vie du joueur sont supérieurs à 0
		 *  - attaquer(Heros autreHeros) : void --> inflige des degats a l'autre heros et l'affiche dans la console
		 *  
		 * Pour finir, instanciez deux Heros, et attrapez vos popcorn en les regardant s'affronter.
		 * Exemple d'affichage final :
		 * __________________________________________________
		 * Hercule (PV : 100 - Atk : 10)
		 * Quasimodo (PV : 20 - Atk : 2)
		 * *****************************
		 * Quasimodo attaque Hercule !
		 * Hercule (PV : 98 - Atk : 10)
		 * Quasimodo (PV : 20 - Atk : 2)
		 * *****************************
		 * Hercule attaque Quasimodo !
		 * Hercule (PV : 98 - Atk : 10)
		 * Quasimodo (PV : 10 - Atk : 2)
		 * *****************************
		 * Quasimodo attaque Hercule !
		 * Hercule (PV : 96 - Atk : 10)
		 * Quasimodo (PV : 20 - Atk : 2)
		 * *****************************
		 * Hercule attaque Quasimodo !
		 * Hercule (PV : 96 - Atk : 10)
		 * Quasimodo (PV : 0 - Atk : 2)
		 * *****************************
		 * Fin de l'affrontement ! Hercule est le vainqueur !
		 * 
		 * Pour aller plus loin (et vous amuser un peu) :
		 * Ajoutez les attributs suivants au Heros, et tenez-en compte dans la méthode attaquer :
		 *  - esquive (int) --> au moment de l'attaque, si le nombre aleatoire tiré est inférieur a l'esquive, le coup est évité
		 *  - defense (int) --> au moment de l'attaque, les degats sont reduits du montant de l'armure
		 *  - critique (int) --> au moment de l'attaque, si le nombre aleatoire tiré est inférieur au critique, les degats sont doublés
		 * __________________________________________________
		 */
		
		Heros heros1 = new Heros("Hercule", 100, 10, 20, 5, 10, 30 );
		Heros heros2 = new Heros("Quasimodo", 20, 2, 10, 3, 5, 15);
		afficherEtat(heros1, heros2);
		
		while (heros1.estVivant() && heros2.estVivant()) {
			if (heros1.getVitesse() > heros2.getVitesse())
				premiereAttaque(heros1, heros2);
			else {
				premiereAttaque(heros2, heros1);
			}
			
		}
		System.out.println("#################################");
		System.out.println("Fin de l'affrontement ! " + (heros1.estVivant() ? heros1.getName() : heros2.getName()) + " est le VAINQUEUR !!!");
		
	}
	private static void afficherEtat(Heros heros1, Heros heros2) {
		System.out.println(heros1);
		System.out.println(heros2);
	}
	private static void premiereAttaque(Heros herosRapide, Heros herosLent) {
		herosRapide.attaquer(herosLent);
		afficherEtat(herosRapide, herosLent);
		if (herosLent.estVivant()) {
			herosLent.attaquer(herosRapide);
			afficherEtat(herosRapide, herosLent);
		}
	}
}
