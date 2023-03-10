package Practical_8.arrayGenerator;

import Practical_8.tools.Print;

/**
 * This is an auxiliary class for checking generators
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */

public class CheckGenerator {

    public static void main(String[] args) {
        int size = 10;
        ArrayGenerator generator;

        System.out.println("Print SortedListingGenerator:");
        for (int i = 0; i < 15; i++) {
            generator = new SortedListingGenerator(size);
            System.out.println(Print.array(generator.getArray(), generator.getSize()));
        }

        System.out.println("");

        System.out.println("Print SimpleRandomListingGenerators:");
        for (int i = 0; i < 15; i++) {
            generator = new SimpleRandomListingGenerator(size);
            System.out.println(Print.array(generator.getArray(), generator.getSize()));
        }

        System.out.println("");

        System.out.println("Print CleverRandomListingGenerators:");
        for (int i = 0; i < 15; i++) {
            generator = new CleverRandomListingGenerator(size);
            System.out.println(Print.array(generator.getArray(), generator.getSize()));

        }

    }
}
