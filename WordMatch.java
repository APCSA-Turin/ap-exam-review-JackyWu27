public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
	String alter = secret;
int count = 0;
        while (alter.indexOf(guess) != -1) {
		count ++;
		alter = alter.substring(alter.indexOf(guess) + 1);
}
return count * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2) {
int g1 = scoreGuess(guess1);
int g2 = scoreGuess(guess2);
if (g1 > g2) {
	return guess1;
} else if (g1 < g2) {
	return guess2;
}
if (guess1.compareTo(guess2) > 0) {
	return guess1;
}
return guess2;
    }
}
