package fr.eni.quelmedecin.ctrl;

public class Methode {

	public static String premiereEnMajuscule(String prenom, String regex) {
		String[] regexArray = regex.split("");
		String separator = "";

		for (int i = 0; i < regexArray.length; i++) {
			if (prenom.contains(regexArray[i])) {
				separator = regexArray[i];
			}
		}

		String[] prenoms = prenom.split(regex);
		for (int i = 0; i < prenoms.length; i++) {
			String item = prenoms[i];
			char firstLetter = item.charAt(0);
			item = Character.toUpperCase(firstLetter) + item.substring(1);
			prenoms[i] = item;
		}
		return String.join(separator, prenoms);
	}

	public static String formatNumeroTelephone(String numero) {

		if (numero.length() != 10 || numero.matches(".*[a-zA-Z].*")) {
			System.err.println("Votre numero de téléphone " + numero + " est incorrect");
			return "<< numéro incorrect >>";
		}
		return numero.replaceAll("(?<=\\G..)", ".");
	}

}
