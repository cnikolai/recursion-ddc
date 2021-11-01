package edu.cnm.deepdive;

public abstract class Palindromes {

  public static boolean checkDenormalized(String str) {
    return checkRecursive(str.replaceAll("[\\W_]+","").toLowerCase());
  }

  public static boolean checkRecursive(String str) {
    final int length = str.length();
    return (length <= 1)
        || ((str.charAt(0) == str.charAt(length -1)) && checkRecursive(str.substring(1, length -1))); //up to but not including last character
  }

  public static boolean checkDenormalizedIterative(String str) {
    return checkIterative(str.replaceAll("[\\W_]+","").toLowerCase());
  }

  public static boolean checkIterative(String str) {
    boolean isPalindrome = true;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(str.length()-i-1)) {
        isPalindrome = false;
        break;
      }
    }
    return isPalindrome;
  }

}
