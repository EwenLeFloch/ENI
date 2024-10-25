package eni.association.bidirectionnelle;

import java.util.*;

public class Magasin {
	private String name;
	List<Article> articles = new ArrayList<Article>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Article> getArticles() {
		return Collections.unmodifiableList(articles);
	}

	public void addArticle(Article article) {
		if (article.getMagasin() == this) {
			articles.add(article);
		}

	}

}
