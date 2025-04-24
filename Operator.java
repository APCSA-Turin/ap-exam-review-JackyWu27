public class Operator {
  /** IMPLEMENTATION PROVIDED TO ENABLE TESTING */
  public static int transform(String str) {
      if (str.equals("orang")) {
        return 2;
      } else if (str.equals("epear")) {
        return 6;
      } else if (str.equals("bl")) {
        return 5;
      } else if (str.equals("ah")) {
        return 4;
      } else {
        return 0;
      }
  }

  /** Returns an integer based on two input strings, as described in part (a)
    *
    * Precondition: input and op are not null.
    *               The length of input is even.
    *               op is either "$$", "^^", or "##".
    */

      public static int compute(String input, String op) {
int val1 = transform(input.substring(0, input.length() / 2));
int val2 = transform(input.substring(input.length() / 2));
if (op.equals("$$")) {
	return val1 + val2;
} else if (op.equals("^^")) {
	return val1 * val2;
}
return val1 - val2;

    }
}

