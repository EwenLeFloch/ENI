package bo;

public enum Couleur {
	BLEU("0000FF", "0,0,255", "blue"),
	ROUGE("FF0000", "255,0,0", "red"),
	VERT("00FF00", "0,255,0", "green");
	
	private String hexa;
	private String rgb;
	private String nom;
	
	private Couleur(String hexa, String rgb, String nom) {
		this.hexa = hexa;
		this.rgb = rgb;
		this.nom = nom;
	}

	public String getHexa() {
		return hexa;
	}

	public String getRgb() {
		return rgb;
	}

	public String getNom() {
		return nom;
	}
	
	
	
}
