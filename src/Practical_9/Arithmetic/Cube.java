package Practical_9.Arithmetic;

/**
 * Defines a method for calculating the cube of an integer.
 * The integer value to be cubed is input by the user.
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */
public class Cube {

    /**
     * Cube an integer.
     *
     * This method should be provided with a proof.
     *
     * @param n the number to be cubed.
     * @return n cubed.
     */
    public static int cube(int n) {
        int i = 0, cube = 0, threeNsq = 0, threeN = 0;

        // Assertion 1
        assert cube == i * i * i : cube;
        assert threeNsq == 3 * i * i : threeNsq;
        assert threeN == 3 * i : threeN;

        while (i != n) {
            // Assertion 2
            assert cube == i * i * i : cube;
            assert threeNsq == 3 * i * i : threeNsq;
            assert threeN == 3 * i : threeN;

            // cube = i^3 + 3i^2 + 3i + 1
            //      = i^3 + 2i^2 + i + i^2 + 2i + 1
            //      = (i + 1) * (i^2 + 2i + 1)
            //      = (i + 1) * (i + 1)^2
            //      = (i + 1) * (i + 1) * (i + 1)
            cube = cube + threeNsq + threeN + 1;

            // Assertion 3
            assert cube == (i + 1) * (i + 1) * (i + 1);
            assert threeNsq == 3 * i * i;
            assert threeN == 3 * i;

            // threeNsq = 3i^2 + 2*3i + 3
            //          = 3 * (i^2 + 2i + 1)
            //          = 3 * (i + 1)^2
            //          = 3 * (i + 1) * (i + 1)
            threeNsq = threeNsq + 2*threeN + 3;

            // Assertion 4
            assert cube == (i + 1) * (i + 1) * (i + 1);
            assert threeNsq == 3 * (i + 1) * (i + 1);
            assert threeN == 3 * i;

            // threeN = 3i + 3 = 3 * (i + 1)
            threeN = threeN + 3;

            // Assertion 5
            assert cube == (i + 1) * (i + 1) * (i + 1);
            assert threeNsq == 3 * (i + 1) * (i + 1);
            assert threeN == 3 * (i + 1);

            i++;

            // Assertion 6
            assert cube == i * i * i : cube;
            assert threeNsq == 3 * i * i : threeNsq;
            assert threeN == 3 * i : threeN;

        }

        // Assertion 7
        assert cube == n * n * n : cube;
        assert threeNsq == 3 * n * n : threeNsq;
        assert threeN == 3 * n : threeN;

        return cube;
    }

    /**
     * Run the cube method.
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {
        int x = 3;
        int result = cube(x);
        System.out.println(x + "^3=" + result);
    }

}
