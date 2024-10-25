package fr.eni.quelmedecin.bo;

public enum Remboursement {
	TFCM1("Tarif fixe conventionné", 100, 0),
	TVCM1("Tarif variable conventionné", 50, 50),
	NCM1("Non conventionné", 0, 0),
	TFCM2("Tarif fixe conventionné", 100, 0),
	TVCM2("Tarif variable conventionné", 50, 75),
	NCM2("Non conventionné", 0, 50);
	
	private String libelle;
	private int secu;
	private int mutuelle;
	private Remboursement(String label, int secu, int mutuelle) {
		this.libelle = label;
		this.secu = secu;
		this.mutuelle = mutuelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public double getTauxSecu() {
		return secu/100.0;
	}
	public double getTauxMutuelle() {
		return mutuelle/100.0;
	}
	
}
