package Practical_8.arrayGeneratorTest;

import Practical_8.arrayGenerator.ArrayGenerator;
import Practical_8.arrayGenerator.CleverRandomListingGenerator;

/**
 * A tester class for CleverRandomListingGenerator. This class inherits size and contents tests from ArrayGeneratorTest
 * and ListingGeneratorTest.
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */

class CleverRandomListingGeneratorTest extends RandomListingGeneratorTest {
    protected ArrayGenerator getGenerator(int size) {
        return new CleverRandomListingGenerator(size); // make getGenerator return a CleverRandomListingGenerator
    }
}