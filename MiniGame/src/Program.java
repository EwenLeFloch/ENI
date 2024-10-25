import java.text.DecimalFormat;
import java.util.Random;

public class Program {

	private static final int TIMES = 10_000_000;

	public static void main(String[] args) {

		int turtle = 0;
		int rabbit = 0;
		for (int i = 0; i < TIMES; i++) {
			if (isRabbitWinner()) {
				rabbit++;
			} else {
				turtle++;
			}
			;
		}
		DecimalFormat df = new DecimalFormat("#.##");
		proba(df);
		double turtleWin = turtle * 100.0 / TIMES;
		double rabbitWin = rabbit * 100.0 / TIMES;
		System.out.println("Score turtle " + df.format(turtleWin) + "% and score rabbit " + df.format(rabbitWin) + "%");

	}

	private static boolean isRabbitWinner() {
		for (int i = 0; i < 4; i++) {
			Random random = new Random();
			if (random.nextInt(6) == 0) {
				return true;
			}
		}
		return false;
	}

	private static void proba(DecimalFormat df) {
		double proba = 5.0 / 6;
		double lost = Math.pow(proba, 4);
		System.out.println("Proba turtle " + df.format(lost * 100.0) + "% and proba rabbit "
				+ df.format((1 - lost) * 100.0) + "%");
	}

}
