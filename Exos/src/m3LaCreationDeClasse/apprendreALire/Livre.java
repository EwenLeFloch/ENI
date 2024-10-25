package m3LaCreationDeClasse.apprendreALire;

import java.util.Arrays;
import java.util.List;

public class Livre {
	private String titre;
	private int nombreDePages;
	private String[] pages;
	
	public Livre(String titre, String[] pages) {
		this.titre = titre;
		this.pages = pages;
		this.nombreDePages = this.pages.length;
	}
	
	public void ajouterPages(String page) {
		List<String> listPages = Arrays.asList(pages);
		listPages.add(page);
	}
	public void consulterPage(int numéroDePage) {
		System.out.println(pages);
	}
	@Override
	public String toString() {
		String infos = titre;
		for (String page : pages) {
			infos += page + "\n" + nombreDePages;
		}
		return infos;
	}
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNombreDePages() {
		return nombreDePages;
	}

	public void setNombreDePages(int nombreDePage) {
		this.nombreDePages = nombreDePage;
	}

	public String[] getPages() {
		return pages;
	}

	public void setPages(String[] pages) {
		this.pages = pages;
	}
	
	
	
	
}
