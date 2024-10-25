package m3LaCreationDeClasse.apprendreALire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Livre {
	private String titre;
	private int nombreDePages;
	private List<String> pages;
	
	public Livre(String titre, String[] pages) {
		this.titre = titre;
		this.pages = new ArrayList<> (Arrays.asList(pages));
		this.nombreDePages = this.pages.size();
	}
	
	public void ajouterPages(String page) {
		
		pages.add(page);
		nombreDePages = pages.size();
	}
	public void consulterPage(int numéroDePage) {
		System.out.println(pages);
	}
	@Override
	public String toString() {
		String infos = titre + "\n";
		for (String page : pages) {
			infos += page + "\n" +(pages.indexOf(page)+1)+"\n";
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

	public List<String> getPages() {
		return pages;
	}

	public void setPages(List<String> pages) {
		this.pages = pages;
	}
	
	
	
	
}
