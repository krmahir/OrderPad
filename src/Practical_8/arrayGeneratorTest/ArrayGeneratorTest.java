package Practical_8.arrayGeneratorTest;

import org.junit.jupiter.api.*;
import Practical_8.arrayGenerator.ArrayGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A tester class for ArrayGenerators. This class defines a single tester method, that can be used to check that
 * array generators generate arrays of the required size, and uses this to define some simple size tests.
 * Implementing classes should implement getGenerator to return an array generator of the relevant type.
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */

abstract class ArrayGeneratorTest {

    private long testStart, testEnd;
    private static long testTotal, testCount;

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

    @BeforeAll
    public static void setUpBeforeAll() {
        testTotal = 0;
        testCount = 0;
        System.out.println("Tests initialised successfully!");
    }

    @AfterAll
    public static void tearDownAfterAll() {
        System.out.println("Average time to run " +  testCount +
                " tests is " + (testTotal/testCount) + " microseconds");
    }


    /**
     * Get an array generator to be tested.  This is used by the testContents method.  Different implementations of
     * can define this method to return a listing generator of the required type.
     * @param size the size of the listing to be generated by the generator.
     * @return a listing generator that will create a listing of the required size.
     */
    protected abstract ArrayGenerator getGenerator(int size);

    /**
     * Check that the generator generates arrays of the required size.
     * @param size the size of array to be generated.
     */
    public void testSize(int size) {
        ArrayGenerator generator = getGenerator(size); // get a generator of the required size

        // Check that it IS the right size
        assertEquals(size, generator.getSize(), "Generator has the wrong size");
        // and that it generates arrays of the right size
        assertEquals(size, generator.getArray().length, "Generator does not create arrays of the wight size");
    }

    // Now define some tests to test array generator sizes.

    @Test
    public void testOneSize() {
        testSize(1);
    }

    @Test
    public void testTwoSize() {
        testSize(2);
    }

    @Test
    public void testFourSize() {
        testSize(4);
    }

    @Test
    public void testHundredSize() {
        testSize(100);
    }

    @Test
    public void testThousandSize() {
        testSize(1000);
    }

    @Test
    public void testMillionSize() {
        testSize(1000000);
    }
}