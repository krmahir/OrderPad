package Practical_8.searcherTest;

import Practical_8.arrayGenerator.ArrayGenerator;
import Practical_8.arrayGenerator.CleverRandomListingGenerator;
import Practical_8.searcher.IndexingError;
import Practical_8.searcher.Searcher;
import org.junit.jupiter.api.Test;
import Practical_8.tools.Print;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Ilias Tachmazidis
 * @version September 2021
 */

abstract class SearcherTest {

    /**
     * Create a searcher of the right type. Each implementation of this abstract method should specify the exact
     * type of searcher that is returned.
     * @param array the array the searcher will search in.
     * @param index the index it will search for.
     * @return a searcher of the type to be used in the tests.
     * @throws IndexingError if the index is not within the bounds of the array.
     */
    abstract protected Searcher createSearcher(int[] array, int index) throws IndexingError;

    /**
     * Test that the searcher finds the correct value.  These tests use listings.  Since listings contain the values
     * 1, 2, ..., n-1 (possibly in a random order) the kth largest entry will always be n-k.
     * @param arraySize the size of the random listing to be generated (the "n" value)
     * @param index the index (the "k" value)
     * @throws IndexingError if k is out of bounds for n
     */
    private void testSearcher(int arraySize,int index) throws IndexingError {
        ArrayGenerator generator = new CleverRandomListingGenerator(arraySize);
        Searcher search = createSearcher(generator.getArray(), index);
        int expected = arraySize-index;
        int found = search.findElement();
        assertEquals(expected, found,"\n\tIncorrect " + Print.ordinal(index) + " largest value found by searcher in array " + Print.array(generator.getArray()) + " (array size " + arraySize + ")");
    }

    @Test
    void test2ndIn10() throws IndexingError {
        testSearcher(10,2);
    }

    @Test
    void test5thIn10() throws IndexingError {
        testSearcher(10,5);
    }
    @Test
    void test3rdIn100() throws IndexingError {
        testSearcher(100,3);
    }

    @Test
    void test16thIn100() throws IndexingError {
        testSearcher(100,16);
    }

    @Test
    void test8thIn1000() throws IndexingError {
        testSearcher(1000,8);
    }

    @Test
    void test107thIn1000() throws IndexingError {
        testSearcher(1000,107);
    }

    @Test
    void test1stIn10000() throws IndexingError {
        testSearcher(10000,1);
    }

    @Test
    void test1003rdIn10000() throws IndexingError {
        testSearcher(10000,1003);
    }

    @Test
    void test11thIn100000() throws IndexingError {
        testSearcher(100000,11);
    }

    @Test
    void test4thIn1000000() throws IndexingError {
        testSearcher(1000000,4);
    }

}