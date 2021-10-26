package edu.cnm.deepdive;

public abstract class Factorials {

  public static long computeRecursive(int n) throws IllegalArgumentException {
    if (n < 0) {
      throw new IllegalArgumentException("Parameter must be greater than or equal to zero.");
    }
    return (n == 0) ? 1 : (n * computeRecursive(n-1));
  }

}
