package Practical_8.arrayGenerator;


/**
 * Uses a more efficient algorithm to randomise the array, a variant of the Fisher-Yates shuffle
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */

public class CleverRandomListingGenerator extends RandomListingGenerator {
    /**
     * Constructor
     * @param size the size of the listing that will be generated.
     */
    public CleverRandomListingGenerator(int size) {
        super(size);
    }

    /**
     * Randomise the array.
     *
     * The algorithm used is a variant of the Fisher-Yates shuffle:
     * <ul>
     *     <li> For each element of the array
     *     <ul>
     *         <li> Pick another, random element of the array (it does not matter if it happens to
     *              be the same element</li>
     *         <li> Swap the two elements</li>
     *     </ul></li>
     *     <li> Since this all happens in the main array, it is now randomised</li>
     * </ul>
     */
    protected void randomise() {
        int[] array = getArray();
        for (int index = 0; index < array.length; index++) { // for each entry in the array
            int randomIndex = getRandomIndex();  // pick a random index
            // swap the two entries
            int randomEntry = array[randomIndex];  // make a copy of the random entry
            array[randomIndex] = array[index];  // copy the current entry to the random index
            array[index] = randomEntry;  // overwrite the current entry with the (remembered) random entry
        }
    }
}
