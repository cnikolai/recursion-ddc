package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FactorialsTest {

  static Stream<Arguments> factorial() {
    return Stream.of(
        Arguments.of(0,new BigInteger("1")),
        Arguments.of(1,new BigInteger("1")),
        Arguments.of(5,new BigInteger("120")),
        Arguments.of(10,new BigInteger("3628800")),
        Arguments.of(13,new BigInteger("6227020800")),
        Arguments.of(32,new BigInteger("263130836933693530167218012160000000")),
        Arguments.of(41,new BigInteger("33452526613163807108170062053440751665152000000000"))
    );
  }

  static Stream<Arguments> factorial_exception() {
    return Stream.of(
        Arguments.of(-1,new IllegalArgumentException())
    );
  }

  @ParameterizedTest
  @MethodSource(value = "factorial")
  void computeRecursive_nonNegative(int arg, BigInteger expectedValue) {
    BigInteger actualValue = Factorials.computeRecursive(arg);
    assertEquals(expectedValue, actualValue);
  }

  @ParameterizedTest
  @MethodSource(value = "factorial")
  void computeIterative_nonNegative(int arg, BigInteger expectedValue) {
    BigInteger actualValue = Factorials.computeIterative(arg);
    assertEquals(expectedValue, actualValue);
  }

  @ParameterizedTest
  @MethodSource(value = "factorial_exception")
  void computeRecursive_negative_exception(int n) {
    assertThrows(IllegalArgumentException.class, () -> Factorials.computeRecursive(n));
  }
}