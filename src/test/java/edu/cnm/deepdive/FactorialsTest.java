package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialsTest {

  //^\s*(\d+)\s*(\d+).*$ -> $1, ; $2,
  final static int[] args = {0,1,5,10,13};
  final static long[] expectedValues = {1,1,120,3628800,6227020800L};

  @Test
  void computeRecursive_nonNegative() {
    for (int i = 0; i < args.length; i++) {
      int n = args[i];
      long expectedValue = expectedValues[i];
      long actualValue = Factorials.computeRecursive(n);
      assertEquals(expectedValue,actualValue);
    }
  }

  @Test
  void computeRecursive_negative_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }
}