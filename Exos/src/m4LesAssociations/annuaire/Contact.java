package m4LesAssociations.annuaire;

public class Contact {
	private String nom;
	private String prenom;
	private Coordonnee coordonnee;
	
	public Contact(String nom, String prenom, Coordonnee coordonnee) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		setCoordonnee(coordonnee);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nom : " + nom + "\n" +
			   "Prénom : " + prenom + "\n" +
			   "coordonnees : " + coordonnee + "\n" ;
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Coordonnee getCoordonnee() {
		return coordonnee;
	}
	public void setCoordonnee(Coordonnee coordonnee) {
		this.coordonnee = coordonnee;
		if (coordonnee != null)
			coordonnee.setContact(this);
	}
	
	
}
