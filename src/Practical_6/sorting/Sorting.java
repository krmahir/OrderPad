package Practical_6.sorting;

import Practical_6.tools.Print;

/**
 * Implements Bubble Sort, Selection Sort and Insertion Sort
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */
public class Sorting {

    /**
     * An auxiliary function that swaps elements within a given array
     *
     * @param array An array to swap elements
     * @param from The index of the array from where the element will be moved
     * @param to The index of the array to where the element will be moved
     */
    public static void swap(Integer[] array, int from, int to){
        Integer tmp = array[from];
        array[from] = array[to];
        array[to] = tmp;
    }

    /**
     * This method implements the Bubble Sort algorithm
     * in order to sort a given array.
     *
     * @param array An array to be sorted
     */
    public static void bubbleSort(Integer[] array) {
        for (int lastUnsorted = array.length - 1;  // the whole list is unsorted
             lastUnsorted > 0; // stop when the whole list is sorted
             lastUnsorted--) { // one new element sorted each time round

            for (int nextToCompare = 0; // start comparing the first two elements
                 nextToCompare < lastUnsorted; // stop at the end of the unsorted portion
                 nextToCompare++) { // move to the next element

                if (array[nextToCompare].compareTo(array[nextToCompare + 1]) > 0) {
                    // the elements are in the wrong order so swap them around
                    swap(array,nextToCompare,nextToCompare+1);
                }
            }
        }
    }

    /**
     * This method implements the Selection Sort algorithm
     * in order to sort a given array.
     *
     * @param array An array to be sorted
     */
    public static void selectionSort(Integer[] array) {
        for (int lastUnsorted = array.length - 1; // the whole list is unsorted
             lastUnsorted > 0; // stop when the whole list is sorted
             lastUnsorted--) { // one new element sorted each time round

            int index = lastUnsorted; // set last element as largest unsorted element

            for (int nextToCompare = 0; // start comparing the first element
                 nextToCompare < lastUnsorted; // stop at the end of the unsorted portion
                 nextToCompare++) { // move to the next element

                if (array[nextToCompare].compareTo(array[index]) > 0) {
                    // A larger unsorted element was found, update index
                    index = nextToCompare;
                }
            }
            // Swap elements, move largest element to the end of unsorted list
            swap(array, index, lastUnsorted);
        }
    }

    /**
     * This method implements the Insertion Sort algorithm
     * in order to sort a given array.
     *
     * @param array An array to be sorted
     */
    public static void insertionSort(Integer[] array) {
        for (int sorted = 0; // only the first element is sorted
             sorted < array.length - 1; // stop when the whole list is sorted
             sorted++) { // one new element sorted each time round

            Integer newElement = array[sorted + 1]; // first unsorted element

            int compareTo = sorted; // start by comparing last sorted
            while (compareTo >= 0 && // move until the start of sorted list
                    newElement.compareTo(array[compareTo]) < 0) {

                // move gap to the left
                array[compareTo + 1] = array[compareTo];
                compareTo--;
            }
            // put unsorted element into gap
            array[compareTo + 1] = newElement;
        }
    }

    public enum SortingAlgorithm { BubbleSort, SelectionSort,
        InsertionSort };

    /**
     * Sort arrays based on different sorting algorithms
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {

        Integer[] array = {4, 3, 5, 1, 9, 24, 7, 40, 18, 15};

        SortingAlgorithm sortingAlgorithm = SortingAlgorithm.BubbleSort;

        System.out.println("Array before sorting: " + Print.array(array, array.length));

        switch (sortingAlgorithm) {
            case BubbleSort: bubbleSort(array); break;
            case SelectionSort: selectionSort(array); break;
            case InsertionSort: insertionSort(array); break;
            default: System.out.println("Please choose a sorting algorithm");
        }

        System.out.println("Array after sorting:  " + Print.array(array, array.length));
    }
}
