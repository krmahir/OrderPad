package Practical_10.university;

import Practical_10.search.Search;
import Practical_10.sorting.Sorting;

/**
 * Implements a domain class representing a lecturer
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */
public class Lecturer extends Person {

    public Lecturer(String name, String surname, Integer age) {
        super(name, surname, age);
    }

    /**
     * This method creates a String representation of
     * the object in a human friendly fashion.
     *
     * @return A String representation of the lecturer
     */
    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "}\n";
    }

    /**
     * Run search and sorting for type Lecturer
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {
        Lecturer[] array = new Lecturer[4];
        array[0] = new Lecturer("John", "John", 30);
        array[1] = new Lecturer("John", "John", 20);
        array[2] = new Lecturer("Jack", "John", 40);
        array[3] = new Lecturer("Jane", "Jane", 25);

        Lecturer value = new Lecturer("Jack", "John", 40);
        int index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0 ? array[index] : "?"));

        Sorting.sort(array, Sorting.SortingAlgorithm.BubbleSort);

        index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0 ? array[index] : "?"));

    }
}
