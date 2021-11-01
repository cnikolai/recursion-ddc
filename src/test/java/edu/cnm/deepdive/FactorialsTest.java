package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class FactorialsTest {

  //^\s*(\d+)\s*(\d+).*$ -> $1, ; $2,
  final static int[] args = {0,1,5,10,13,32,41};
  final static BigInteger[] expectedValues = {new BigInteger("1"),new BigInteger("1"),new BigInteger("120"),new BigInteger("3628800"),new BigInteger("6227020800"), new BigInteger("263130836933693530167218012160000000"), new BigInteger("33452526613163807108170062053440751665152000000000")};

  @Test
  void computeRecursive_nonNegative() {
    for (int i = 0; i < args.length; i++) {
      int n = args[i];
      BigInteger expectedValue = expectedValues[i];
      BigInteger actualValue = Factorials.computeRecursive(n);
      assertEquals(expectedValue,actualValue);
    }
  }

  @Test
  void computeRecursive_negative_exception() {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(-1));
  }
}