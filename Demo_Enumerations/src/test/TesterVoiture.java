package test;



import bo.BoiteVitesse;
import bo.Couleur;
import bo.Voiture;
import bo.Voiture.Categorie;

public class TesterVoiture {
	public static void main(String[] args) {
		Voiture v = new Voiture("123abc132", "Mercedes", "slk", 230);
		v.setCategorie(Categorie.BREAK);
		v.setCouleur(Couleur.BLEU);
		v.setBoiteVitesse(BoiteVitesse.MANUELLE);
		
		System.out.println(v);
	}
}
