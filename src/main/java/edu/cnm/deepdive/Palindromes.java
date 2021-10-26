package edu.cnm.deepdive;

public abstract class Palindromes {

  public static boolean checkDenormalized(String str) {
    str.replaceAll("[\\W_]+","").toLowerCase();
    return checkRecursive(str);
  }

  public static boolean checkRecursive(String str) {
    final int length = str.length();
    return (length <= 1)
        || ((str.charAt(0) == str.charAt(length -1)) && checkRecursive(str.substring(1, length -1))); //up to but not including last character
  }

}
