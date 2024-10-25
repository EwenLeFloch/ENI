package m4LesAssociations.annuaire;

public class TesterAnnuaire {
	public static void main(String[] args) {
		/*
		 * Créez deux classes, Contact et Coordonnees. Un Contact est caractérisé par :
		 * - un nom - un prenom - une coordonnee
		 * 
		 * Une Coordonnee est caractérisée par : - un numéro de téléphone fixe - un
		 * numéro de téléphone portable - un contact
		 * 
		 * Chaque classe dispose d'une méthode toString permettant de consulter ses
		 * attributs Chaque classe dispose de getters et de setters
		 * 
		 * Créez deux classes et deux coordonnées dans ce main, associez-les, puis,
		 * affichez-les pour vous assurer que vos
		 */
		Coordonnee c1 = new Coordonnee("0202020202", "0606060606");
		Coordonnee c2 = new Coordonnee("0303030303", "0707070707");
		Contact jean = new Contact("Jean", "Dupoind", c2);
		Contact remi = new Contact("Rémi", "Gaillard", c1);
		
		System.out.println(jean);
		System.out.println(remi);
		
		
	}
}
