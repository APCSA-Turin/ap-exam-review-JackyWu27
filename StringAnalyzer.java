public class StringAnalyzer {
  /** Returns a count of how many times smallStr occurs in largeStr, as
    * described in part (a)
    *
    * Precondition: largeStr is not null; smallStr is not null.
    *          The length of smallStr is less than the length of largeStr.
    */
   public static int countRepeat(String largeStr, String smallStr) {
	String check = largeStr;
int count = 0;
	while (check.indexOf(smallStr) != -1) {
		check = check.substring(check.indexOf(smallStr) + smallStr.length());
    count ++;
}
return count;
}

}
