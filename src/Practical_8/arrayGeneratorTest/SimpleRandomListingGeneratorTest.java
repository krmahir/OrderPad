package Practical_8.arrayGeneratorTest;

import Practical_8.arrayGenerator.ArrayGenerator;
import Practical_8.arrayGenerator.SimpleRandomListingGenerator;

/**
 * A tester class for SimpleRandomListingGenerator. This class inherits size and contents tests from ArrayGeneratorTest
 * and ListingGeneratorTest.
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */

class SimpleRandomListingGeneratorTest extends RandomListingGeneratorTest {
    protected ArrayGenerator getGenerator(int size) {
        return new SimpleRandomListingGenerator(size); // make getGenerator return a SimpleRandomListingGenerator
    }
}