
import java.io.*;
import java.util.*;

public class Wordle {
	
	private static String[] words = fileToArray();

	public static void main(String[] args) {
		int points = 50;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voulez-vous jouer à Maximot ?");
		String answer = scanner.nextLine();
		
		while (answer.equalsIgnoreCase("oui") && points > 0) {
			
			int attempts = 5;
			String word = getOneWord(words).toLowerCase();
			String newWord = shuffleLetters(word);
	
			System.out.println(newWord+"\nDe quel mot s'agit-il ?");
			answer = scanner.nextLine();
			
			boolean equal = isEqual(answer, word, attempts, scanner);
			
			points = credit(points, equal, word);
			
			showPoints(points, attempts, word, equal);
			
	
	
			System.out.println("Voulez-vous continuer ?");
			answer = scanner.nextLine();
			
		}
	
		showFinalPoints(points);

	}
	
	/**
	 * Get one random word from an array of words
	 * @param array
	 * A list of words
	 * @return String
	 * One random word 
	 */
	private static String getOneWord(String[] words) {
		int rnd = new Random().nextInt(words.length);
			return words[rnd];
	}
	
	/**
	 * Shuffle randomly the letters from a word
	 * @param word
	 * A word
	 * @return String
	 * The word with its letters shuffled
	 */
	private static String shuffleLetters(String word) {
		ArrayList<Character> letters = new ArrayList<>();
		
		for (char letter : word.toCharArray()) {
			letters.add(letter);
		}
		Collections.shuffle(letters);
		StringBuilder randomizedWord = new StringBuilder();
		for (char letter : letters) {
			randomizedWord.append(letter);
		}
		return randomizedWord.toString().toLowerCase();
	}
	
	/**
	 * Check if prompt is equal to the previous picked random word
	 * 
	 * @param answer
	 * The prompt word
	 * @param word
	 * The random word
	 * @param attempts
	 * the number of attempts
	 * @param sc
	 * the Scanner object
	 * @return boolean
	 * true or false
	 */
	private static boolean isEqual(String answer, String word, int attempts, Scanner sc) {
		while(!answer.equalsIgnoreCase(word)) {
			attempts--;
			if (attempts == 0) {
				return false;
			}
	
			System.out.println("Perdu !\nIl vous reste " +attempts+ " essais.");
			answer = sc.nextLine();
		}
		return true;
	}
	
	/**
	 * get the text file and put each line in an array
	 * 
	 * @return String[]
	 * The array of words
	 */
	private static String[] fileToArray() {
		String filePath = "dictionnaire.txt";
		ArrayList<String> lines = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		
		}	
		String[] words = lines.toArray(new String[0]);
		return words;
	}
	
	/**
	 * Add or subtract the points after a win or a lose
	 * 
	 * @param points
	 * The previous points
	 * @param equal
	 * The boolean of win or lose
	 * @param word
	 * the word to guess
	 * @return integer
	 * the new points
	 */
	private static int credit(int points, boolean equal, String word) {
		 if (!equal) {
			 return points -= word.length();
		 }
		 return points += word.length();
	}
	
	/**
	 * Show the points after a win or lose
	 * @param points
	 * the points
	 * @param attempts
	 * the number of attempts
	 * @param word
	 * the word to guess
	 * @param equal
	 * the boolean of win or lose
	 * 
	 */
	private static void showPoints(int points, int attempts, String word, boolean equal) {
		if (!equal) {
			System.out.println("Perdu ! Le mot à trouver était " +word+ "\nVotre solde est désormais de " +points);
		} else {
			System.out.println("Bien joué, le mot était bien " +word+ "\nVous avez trouvé en " +(5-attempts)+ " essais. Votre solde est de " +points);
		}
	}
	
	/**
	 * Show the final points after the last game
	 * @param points
	 */
	private static void showFinalPoints(int points) {
		if (points >= 50) {
			System.out.println("Vous avez gagné " +(points-50)+ " points.");
		} else {
			System.out.println("Vous avez perdu " +(50-points)+ " points.");
		}
	}
}
