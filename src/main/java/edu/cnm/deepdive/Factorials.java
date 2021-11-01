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
    //return (n == 0) ? 1 : (n.multiply(computeRecursive(n.subtract(1))));
  }

}
