package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final double DELTA = 0.00000001;

    @Test
    public void testAverageBasic() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), DELTA, "Average of 2.0 and 4.0 should be 3.0");
    }

    @Test
    public void testAverageNegative() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(-1.0, sqrt.average(-2.0, 0.0), DELTA, "Average of -2.0 and 0.0 should be -1.0");
    }

    @Test
    public void testGoodTrue() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0), "Guess 2.0 should be good for 4.0");
    }

    @Test
    public void testGoodFalse() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(3.0, 4.0), "Guess 3.0 should not be good for 4.0");
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.improve(2.0, 4.0), DELTA, "Improve 2.0 for 4.0 should be 2.0");
    }

    @Test
    public void testIterConverged() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), DELTA, "Iter with good guess should return guess");
    }

    @Test
    public void testIterImprove() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(1.0, 4.0), DELTA, "Iter starting from 1.0 should converge to 2.0");
    }

    @Test
    public void testCalcSquareNumber() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), DELTA, "Square root of 9.0 should be 3.0");
    }

    @Test
    public void testCalcNonSquareNumber() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), DELTA, "Square root of 2.0 should match Math.sqrt");
    }

    @Test
    public void testCalcZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), DELTA, "Square root of 0.0 should be 0.0");
    }
}