package eni.association.bidirectionnelle;

public class Program {

	public static void main(String[] args) {
		var devred = new Magasin();
		devred.setName("Devred");
		var jules = new Magasin();
		jules.setName("Jules");

		var jeans = new Article("Jeans", devred);
		var pull = new Article("Pull", jules);

		devred.addArticle(jeans);
		jules.addArticle(pull);

		displayMagasin(jules);
		displayMagasin(devred);

		displayArticle(jeans);
		displayArticle(pull);

	}

	static void displayMagasin(Magasin magasin) {
		System.out.println("le magasin " + magasin.getName() + " possède : ");
		for (var article : magasin.getArticles()) {
			System.out.println("\t" + article.getName());

		}
	}

	static void displayArticle(Article article) {
		System.out.println(
				"l'article " + article.getName() + " appartient au magasin " + article.getMagasin().getName());
	}

}
