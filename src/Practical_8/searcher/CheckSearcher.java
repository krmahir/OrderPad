package Practical_8.searcher;

import Practical_8.arrayGenerator.*;
import Practical_8.tools.Print;

/**
 * This is an auxiliary class for checking searchers
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */

public class CheckSearcher {

    public static void main(String[] args) throws IndexingError {
        int size = 10;
        int index = 3; // kth largest element
        ArrayGenerator generator;

        System.out.println("Search SortedListingGenerators:");
        for (int i = 0; i < 15; i++) {
            generator = new SortedListingGenerator(size);
            System.out.println(Print.array(generator.getArray(), generator.getSize()));
            Searcher searcher = new SimpleSearcher(generator.getArray(), index);
            System.out.println(Print.ordinal(index) + " largest element: " + searcher.findElement());
        }

        System.out.println("");

        System.out.println("Search SimpleRandomListingGenerators:");
        for (int i = 0; i < 15; i++) {
            generator = new SimpleRandomListingGenerator(size);
            System.out.println(Print.array(generator.getArray(), generator.getSize()));
            Searcher searcher = new SimpleSearcher(generator.getArray(), index);
            System.out.println(Print.ordinal(index) + " largest element: " + searcher.findElement());
        }

        System.out.println("");

        System.out.println("Search SimpleRandomListingGenerators:");
        for (int i = 0; i < 15; i++) {
            generator = new CleverRandomListingGenerator(size);
            System.out.println(Print.array(generator.getArray(), generator.getSize()));
            Searcher searcher = new SimpleSearcher(generator.getArray(), index);
            System.out.println(Print.ordinal(index) + " largest element: " + searcher.findElement());
        }
    }
}
