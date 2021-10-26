package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {

  final static String[] palindromes = {
      "radar",
      "Radar",
      "A man, a plan, a canal - Panama!",
      "A man, a plan, a dam - Hoover!",
      "aBbA"
  };

  final static boolean[] expectedValues = {
      true,
      true,
      true,
      false,
      true
  };

  @Test
  void checkDenormalized() {
    for (int i = 0; i < palindromes.length; i++) {
      String inputValue = palindromes[i];
      boolean expectedValue = expectedValues[i];
      boolean actualValue = Palindromes.checkDenormalized(inputValue);
      assertEquals(expectedValue, actualValue);
    }
  }

  @Test
  void checkRecursive() {
  }
}