package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class PalindromesTest {

  @ParameterizedTest
  @CsvFileSource(resources = "palindromes.csv", numLinesToSkip = 1)
  void checkRecursive(String input, boolean expected) {
    assertEquals(expected, Palindromes.checkRecursive(input));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "denormalized_palindromes.csv", numLinesToSkip = 1)
  void checkDenormalized(String input, boolean expected) {
    assertEquals(expected, Palindromes.checkDenormalized(input));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "denormalized_palindromes.csv", numLinesToSkip = 1)
  void checkDenormalizedIterative(String input, boolean expected) {
    assertEquals(expected, Palindromes.checkDenormalizedIterative(input));
  }
}