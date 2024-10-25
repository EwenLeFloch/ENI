package fr.eni.quelmedecin.bo;

import java.util.Comparator;

public class MedecinComparator implements Comparator<MedecinSpecialiste> {

	@Override
	public int compare(MedecinSpecialiste o1, MedecinSpecialiste o2) {
		// TODO Auto-generated method stub
		String specialite1 = o1.getSpecialite().getLibelle();
		String specialite2 = o2.getSpecialite().getLibelle();
		if (specialite1 == specialite2)
			return 0;
		if (specialite1 == null)
			return 1;
		if (specialite2 == null)
			return -1;
		return specialite1.compareTo(specialite2);
	}

}
