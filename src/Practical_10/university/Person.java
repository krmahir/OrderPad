package Practical_10.university;

import Practical_10.search.Search;
import Practical_10.sorting.Sorting;

/**
 * Implements a domain class representing a person
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */
public class Person implements Comparable<Person> {
    String name;
    String surname;
    Integer age;

    /**
     * This constructor initialises the fields of the class
     *
     * @param name The first name of the person
     * @param surname The last name of the person
     * @param age The age of the person
     */
    Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    /**
     * This method creates a String representation of
     * the object in a human friendly fashion.
     *
     * @return A String representation of the person
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                "}\n";
    }

    /**
     * This is a method implementation for
     * the Comparable interface
     *
     * @param p A person to compare to
     * @return Total ordering as a result of surname, name and  age
     */
    @Override
    public int compareTo(Person p) {
        int last = this.surname.compareTo(p.surname);
        int first = this.name.compareTo(p.name);
        int age = this.age.compareTo(p.age);

        // sort based on: surname -> name ->  age
        return last == 0 ? (first == 0 ? age : first) : last;
    }

    /**
     * Run search and sorting for type Person
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {
        Person[] array = new Person[4];
        array[0] = new Student("John", "John", 30);
        array[1] = new Person("John", "John", 20);
        array[2] = new Person("Jack", "John", 40);
        array[3] = new Lecturer("Jane", "Jane", 25);

        Person value = new Person("Jack", "John", 40);
        int index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));

        Sorting.sort(array, Sorting.SortingAlgorithm.BubbleSort);

        index = Search.search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));

    }
}
