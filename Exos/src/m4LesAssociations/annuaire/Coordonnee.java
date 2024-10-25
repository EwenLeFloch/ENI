package m4LesAssociations.annuaire;

public class Coordonnee {
	private String fixe;
	private String portable;
	private Contact contact;
	
	public Coordonnee(String fixe, String portable) {
		this.fixe = fixe;
		this.portable = portable;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Téléphone fixe : " + fixe + "\n" +
			   "Téléphone Portable : " + portable;
	}
	
	public String getFixe() {
		return fixe;
	}
	public void setFixe(String fixe) {
		this.fixe = fixe;
	}
	public String getPortable() {
		return portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Contact getContact() {
		return contact;
	}
	
}
