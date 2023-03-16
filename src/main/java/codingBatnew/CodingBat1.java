package codingBatnew;

public class CodingBat1 {

    /*
    Given a non-empty string and an int n, return a new string where the char
    at index n has been removed.The value of n will be a valid index of a char
    in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

tte
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */

    public static void main(String[] args) {
        String s = "kitten";
        System.out.println(missingChar(s,2));
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, 2);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(2 + 1, str.length());

        return front + back;
    }
}



