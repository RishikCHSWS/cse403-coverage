package triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

import org.junit.jupiter.api.Test;

import triangle.Triangle.Type;

/** Test class for the Triangle implementation. */
public class TriangleTest {

  /** Wrapper to avoid code duplication in test methods. */
  private void testTriangle(Type expected, int a, int b, int c) {
    assertEquals(expected, Triangle.classify(a, b, c));
  }

  @Test
  public void testDummy() {
    // Cover the default constructor.
    Triangle a = new Triangle();
  }

  @Test
public void testTable() {
    testTriangle(INVALID, 0, 1, 1);
    testTriangle(SCALENE, 3, 4, 5);
    testTriangle(INVALID, 1, 2, 3);
    testTriangle(EQUILATERAL, 5, 5, 5);
    testTriangle(ISOSCELES, 4, 4, 3);
    testTriangle(INVALID, 2, 2, 5);
    testTriangle(ISOSCELES, 4, 3, 4);
    testTriangle(ISOSCELES, 3, 4, 4);
    testTriangle(INVALID, 8, 4, 4);
    testTriangle(INVALID, 2, 10, 2);
    testTriangle(INVALID, 10, 2, 2);
    testTriangle(INVALID, 1, -1, 1); 
    testTriangle(INVALID, 1, 1, -1); 
    testTriangle(INVALID, 4, 3, 8); 
    testTriangle(INVALID, 3, 10, 4);
    testTriangle(INVALID, 10, 3, 2);

}
}
