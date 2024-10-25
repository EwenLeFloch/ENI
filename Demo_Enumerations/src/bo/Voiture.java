package bo;

public class Voiture {
	private String immatriculation;
	private String marque;
	private String modele;
	private int vitesseMax;
	private Categorie categorie;
	private BoiteVitesse boiteVitesse;
	private Couleur couleur;
	
	
	public enum Categorie {
		QUATREQUATRE,
		SUV,
		CITADINE,
		BERLINE,
		BREAK,
		CABRIOLET,
		COUPE,
		MONOSPACE
	}
	
	public Voiture(String immatriculation, String marque, String modele, int vitesseMax) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.vitesseMax = vitesseMax;
	}
	
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getVitesseMax() {
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public BoiteVitesse getBoiteVitesse() {
		return boiteVitesse;
	}

	public void setBoiteVitesse(BoiteVitesse boiteVitesse) {
		this.boiteVitesse = boiteVitesse;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
	

}
