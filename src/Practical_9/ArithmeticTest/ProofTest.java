package Practical_9.ArithmeticTest;

import Practical_9.Arithmetic.Cube;
import Practical_9.Arithmetic.Square;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A tester class for proofs
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */
public class ProofTest {

    private long testStart, testEnd;
    private static long testTotal, testCount;

    // Auxiliary functions that facilitate testing within different ranges

    public void testSquareSize(int size) {
        for (int i = 1; i <= size; i++) {
            assertEquals(i * i, Square.square(i),
                    "Square returns wrong result for i = " + i);
        }
    }

    public void testCubeSize(int size) {
        for (int i = 1; i <= size; i++) {
            assertEquals(i * i * i, Cube.cube(i),
                    "Cube returns wrong result for i = " + i);
        }
    }

    // Setup counters for number of tests and total time for all tests

    @BeforeAll
    public static void setUpBeforeAll() {
        testTotal = 0;
        testCount = 0;
        System.out.println("Tests initialised successfully!");
    }

    @AfterAll
    public static void tearDownAfterAll() {
        System.out.println("Average time to run " + testCount +
                " tests is " + (testTotal / testCount) + " microseconds");
    }

    // Setup each test individually

    @BeforeEach
    public void setUp() {
        testStart = System.nanoTime();
        testCount++;
    }

    @AfterEach
    public void tearDown(TestInfo testInfo) {
        testEnd = System.nanoTime();
        long timeInMicros = (testEnd - testStart) / 1000;
        testTotal += timeInMicros;
        System.out.println("Test " + testInfo.getDisplayName() +
                " took " + timeInMicros + " microseconds");
    }

    // Define some tests to test your proofs

    @Test
    public void testSquareTenSize() {
        testSquareSize(10);
    }

    @Test
    public void testSquareHundredSize() {
        testSquareSize(100);
    }

    @Test
    public void testSquareThousandSize() {
        testSquareSize(1000);
    }

    @Test
    public void testSquareTenThousandSize() {
        testSquareSize(10000);
    }

    @Test
    public void testSquareHundredThousandSize() {
        testSquareSize(100000);
    }

    /*
    // Ranging within millions of numbers might take a lot of time
    @Test
    public void testSquareMillionSize() {
        testSquareSize(1000000);
    }
    */

    @Test
    public void testCubeTenSize() {
        testCubeSize(10);
    }

    @Test
    public void testCubeHundredSize() {
        testCubeSize(100);
    }

    @Test
    public void testCubeThousandSize() {
        testCubeSize(1000);
    }

    @Test
    public void testCubeTenThousandSize() {
        testCubeSize(10000);
    }

    @Test
    public void testCubeHundredThousandSize() {
        testCubeSize(100000);
    }

    /*
    // Ranging within millions of numbers might take a lot of time
    @Test
    public void testCubeMillionSize() {
        testCubeSize(1000000);
    }
    */

}
