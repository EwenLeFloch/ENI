package eni.demo;

public class Program {

	public static void main(String[] args) {
		var roger = new Personne();
		
		roger.setPrenom("roger");
		roger.setNom("Moore");
		displayPersonne(roger);
		var simone = new Personne("Signoret", "Simone");
		displayPersonne(simone);
	}
	
	private static void displayPersonne(Personne personne) {
		System.out.println(personne.getPrenom()+" "+personne.getNom());
	}

}
