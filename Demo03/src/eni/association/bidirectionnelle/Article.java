package eni.association.bidirectionnelle;

public class Article {
	private String name;
	private Magasin magasin;

	public Article(String name, Magasin magasin) {
		this.name = name;
		this.magasin = magasin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

}
