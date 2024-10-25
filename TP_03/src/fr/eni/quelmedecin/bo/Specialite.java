package fr.eni.quelmedecin.bo;

public enum Specialite {
	ANESREA("Anesthésie/Réanimation", "Aile ouest"),
	ANGIO("Angiologie", "Aile ouest"),
	CARDIO("Cardiologie", "Aile nord"),
	ENDOCRINO("Endocrinologie", "Aile est"),
	GYNECO("Gynécologie", "Aile est"),
	GASTRO("GastroEnthérologie", "Aile nord"),
	OPHTALMO("Ophtalmologie", "Aile sud"),
	ORL("Orl", "Aile sud"),
	RADIO("Radiologie", "Aile nord"),
	RHUMATO("Rhumatologie", "Aile sud"),
	STOMATO("Stomatologie", "AIle sud"),
	URO("Urologie", "Aile est"),
	OSTHEO("Osthéopathie", "Aile nord"),
	NEURO("Neurochirurgie", "Aile ouest"),
	ORTHO("Orthopédie", "Aile sud"),
	PEDIA("Pédiatrie", "Aile est"),
	PNEUMO("Pneumologie", "Aile nord"),
	KINE("Kinésithérapie", "Aile est");
	
	private String libelle;
	private String situationGeo;

	private Specialite(String libelle, String situationGeo) {
		this.libelle = libelle;
		this.situationGeo = situationGeo;
	}

	public String getLibelle() {
		return libelle;
	}

	public String getSituationGeo() {
		return situationGeo;
	}

	
	
	
	
}
