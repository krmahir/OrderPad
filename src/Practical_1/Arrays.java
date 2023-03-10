package Practical_1;

/**
 * Defines a method for processing arrays
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */
public class Arrays {

    /**
     * A method that divides the elements of two arrays
     * given as input and computes the sum as well as the
     * minimum, maximum and average value
     *
     * @param A Array's elements are used as dividend
     * @param B Array's elements are used as divisors
     */
    public static void processArrays(int[] A, int[] B) {

        double[] C = new double[10];
        double min = (double) A[0] / B[0];
        double max = (double) A[0] / B[0];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < C.length; i++) {
            // update an element of array C
            C[i] = (double) A[i] / B[i];

            System.out.println("C[" + i + "]: " + C[i]);

            // increase sum with current element of array C
            sum += C[i];

            // check if min is current minimum
            if (min > C[i]) {
                min = C[i];
            }

            // check if max is current maximum
            if (max < C[i]) {
                max = C[i];
            }
        }
        // Compute average value
        avg = sum / C.length;

        System.out.println("sum: " + sum);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("avg: " + avg);
    }

    /**
     * Process arrays.
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {
        int[] A = {124, 117, 478, 786, 111, 325, 422, 145, 523, 33};
        int[] B = {8, 9, 17, 4, 68, 56, 38, 77, 81, 2};

        processArrays(A, B);
    }
}
