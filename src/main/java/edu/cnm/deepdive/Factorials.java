package edu.cnm.deepdive;

import java.math.BigInteger;

public abstract class Factorials {

  public static BigInteger computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException("Parameter must be greater than or equal to zero.");
    }
    if (n == 0) {
      return new BigInteger("1");
    } else {
      return BigInteger.valueOf(n).multiply(computeRecursive(n-1));
    }
  }

  public static BigInteger computeIterative(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException("Parameter must be greater than or equal to zero.");
    }
    BigInteger factorial = BigInteger.ONE;
    for (int i = n; i > 0; i--) {
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }
    return factorial;
  }
}
