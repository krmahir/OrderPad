package Practical_9.Arithmetic;

/**
 * <p>
 * Defines a method for calculating the square of an integer.  The integer value to be squared is input by the user.
 * </p>
 * <p>
 * This implementation also includes assertions to support a proof of the correctness of the code.
 * </p>
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */
public class Square {

    /**
     * Square an integer.
     *
     * This method is annotated with assertions.  These assertions, in combination with their description in
     * the lecture notes, constitute a proof of the method.
     *
     * @param n the integer to be squared.
     * @return n squared.
     */
    public static int square(int n) {
        int i = 0, square = 0, twoN = 0;

        // Assertion 1
        assert square == i * i : square;
        assert twoN == 2 * i : twoN;

        while (i != n) {
            // Assertion 2
            assert square == i * i : square;
            assert twoN == 2 * i : twoN;

            square = square + twoN + 1;

            // Assertion 3
            assert square == (i + 1) * (i + 1);
            assert twoN == 2 * i;

            twoN = twoN + 2;

            // Assertion 4
            assert square == (i + 1) * (i + 1);
            assert twoN == 2 * (i + 1);

            i++;

            // Assertion 5
            assert square == i * i : square;
            assert twoN == 2 * i : twoN;
        }

        // Assertion 6
        assert square == n * n : square;
        assert twoN == 2 * n : twoN;

        return square;
    }

    /**
     * Run the square method.
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {
        int x = 3;
        int result = square(x);
        System.out.println(x + "^2=" + result);
    }
}
