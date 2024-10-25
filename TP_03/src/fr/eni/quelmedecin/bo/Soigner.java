package fr.eni.quelmedecin.bo;

public interface Soigner {
	default void examiner() {
		System.out.println(
				"Le médecin procède à des examens de routine sur les patients (auscultation, prise de tensions, ...)");
	};

	default void diagnostiquer() {
		System.out.println("Le médecin évalue l'état de santé du patient pour découvrir d'éventuels problèmes");
	};

	default void traiter() {
		System.out.println("Le médecin met en place un traitement adapté");
	};

	default void conseiller() {
		System.out.println(
				"Le médecin dispense des conseils appropriés pour des habitudes saines (régime, hygiène, etc...)");
	};

	void orienter();
}
