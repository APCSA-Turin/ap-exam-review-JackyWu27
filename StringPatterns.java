public class StringPatterns {
  /** Returns the String that results when letter and pattern are
    * compared, as described in part (a)
    *
    * Precondition: letter consists of one uppercase letter.
    *     pattern has at least 2 letters and all letters are uppercase
    *     and unique.
    */
  public static String letterAndPattern(String letter, String pattern){
	if (pattern.indexOf(letter) != -1) {
		return letter;
}
String reverse = "";
for (int c = pattern.length() - 1; c > -1; c--) {
	reverse += pattern.substring(c, c + 1);
} 
return reverse;

}

}
