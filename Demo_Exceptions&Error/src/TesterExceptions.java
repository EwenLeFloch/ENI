
public class TesterExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testerNullPointer("Coucou");
		testerIndexOutOfBounds(2);
		testerArithmeticException(2);
		testerClassCastException(17);
	}
	private static void testerIndexOutOfBounds(int index) {
		
		int[] entiers = {1, 5, 8};
		if (index < 0 || index >= entiers.length) return;
		System.out.println(entiers[index]);
	}
	private static void testerNullPointer(String texte) {
		if (texte == null) return;
		System.out.println(texte.toUpperCase());
	}
	private static void testerArithmeticException(int diviseur) {
		if (diviseur == 0) return; 
		System.out.println(5/diviseur);
	}
	private static void testerClassCastException(Object param) {
		if (!(param instanceof Integer)) return;
		int entier = (int) param;
		System.out.println(entier);
	}

}
