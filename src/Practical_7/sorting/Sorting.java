package Practical_7.sorting;

import Practical_7.tools.Print;

import java.util.Arrays;

/**
 * Implements Merge Sort and Quick Sort
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
     * This method implements the Merge Sort algorithm
     * in order to sort a given array.
     *
     * @param array An array to be sorted
     */
    public static void mergeSort(Integer[] array) {
        // Apply merge sort as long as there are at least two
        // elements in the array
        if (array.length < 2) {
            return;
        }

        // Create a copy of lower and upper arrays
        Integer[] lowerArray = Arrays.copyOfRange(array, 0, array.length / 2);
        Integer[] upperArray = Arrays.copyOfRange(array, array.length / 2, array.length);

        // Call merge sort recursively on lower array
        mergeSort(lowerArray);
        // Call merge sort recursively on upper array
        mergeSort(upperArray);
        // merge lower and upper arrays into the initial array
        merge(array, lowerArray, upperArray);
    }

    /**
     * This method merges lowerArray and upperArray into a
     * single array. The resulting array is sorted
     *
     * @param array The final merged array (to be sorted)
     * @param lowerArray A sorted sub array
     * @param upperArray A sorted sub array
     */
    public static void merge(Integer[] array, Integer[] lowerArray, Integer[] upperArray) {
        int arrayIndex = 0, lowerIndex = 0, upperIndex = 0;

        // gradually merge lowerArray and upperArray into array
        while (lowerIndex < lowerArray.length && upperIndex < upperArray.length) {
            // lowerArray has the minimum value
            if (lowerArray[lowerIndex].compareTo(upperArray[upperIndex]) < 0) {
                array[arrayIndex] = lowerArray[lowerIndex++];
            } else {
                array[arrayIndex] = upperArray[upperIndex++];
            }
            arrayIndex++;
        }

        // lowerArray has some values left (upperArray is empty)
        while (lowerIndex < lowerArray.length) {
            array[arrayIndex] = lowerArray[lowerIndex];
            lowerIndex++;
            arrayIndex++;
        }

        // upperArray has some values left (lowerArray is empty)
        while (upperIndex < upperArray.length) {
            array[arrayIndex] = upperArray[upperIndex];
            upperIndex++;
            arrayIndex++;
        }
    }

    /**
     * This method implements Quick Sort algorithm
     * in order to sort a given array.
     *
     * @param array An array to be sorted
     * @param low The lowest limit in current sub array
     * @param high The highest limit in current sub array
     */
    public static void quickSort(Integer[] array, int low, int high) {
        // Apply quick sort as long as there are at least two elements
        // in the current subset of the array
        if (low < high) {
            // Partition the subset of the array into three parts
            // (small, pivot, large). Pivot element is placed
            // in the correct position
            int pivot_index = partition(array, low, high);

            // Call quick sort recursively on lower part
            quickSort(array, low, pivot_index  - 1);
            // Call quick sort recursively on upper part
            quickSort(array, pivot_index  + 1, high);
        }
    }

    /**
     * This method chooses a pivot within the array and
     * partitions the subset of the array into three parts
     * (small, pivot, large). Small means elements are less
     * that pivot, while large means elements are more than
     * pivot.
     *
     * @param array An array to be sorted
     * @param low The lowest limit in current sub array
     * @param high The highest limit in current sub array
     * @return The position of the pivot
     */
    public static int partition(Integer[] array, int low, int high) {

        Integer pivot = array[high]; // choose pivot
        int store = low; // start from low

        for (int i = low; i <= high - 1; i++) {
            // Move elements that are smaller than the pivot to the
            // left of the correct position of the pivot
            if (array[i].compareTo(pivot) < 0) {
                swap(array, store, i); // swap small elements
                store++; // move index to the right
            }
        }

        // Place pivot in correct position
        swap(array, store, high);

        return store;
    }

    public enum SortingAlgorithm { MergeSort, QuickSort }

    /**
     * Sort arrays based on different sorting algorithms
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {

        Integer[] array = {4, 3, 5, 1, 9, 24, 7, 40, 18, 15};

        SortingAlgorithm sortingAlgorithm = SortingAlgorithm.MergeSort;

        System.out.println("Array before sorting: " + Print.array(array, array.length));

        switch (sortingAlgorithm) {
            case MergeSort: mergeSort(array); break;
            case QuickSort: quickSort(array,0,array.length-1); break;
            default: System.out.println("Please choose a sorting algorithm");
        }

        System.out.println("Array after sorting:  " + Print.array(array, array.length));
    }
}
