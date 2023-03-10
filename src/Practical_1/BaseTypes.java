package Practical_1;

/**
 * Defines methods for checking valid values for various
 * base types in Java
 *
 * @author Ilias Tachmazidis
 * @version September 2021
 */
public class BaseTypes {

    /**
     * Check base type boolean
     */
    public static void baseTypeBoolean() {
        boolean b1 = true; // valid
        boolean b2 = false; // valid
        //boolean b3 = 'Z'; // invalid
        //boolean b4 = '\\'; // invalid
        //boolean b5 = 100; // invalid
        //boolean b6 = 10000; // invalid
        //boolean b7 = 1000000; // invalid
        //boolean b8 = 10000000000L; // invalid
        //boolean b9 = 3.14f; // invalid
        //boolean b10 = 2.71828d; // invalid

        System.out.println("Output for booleans:");

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);

        System.out.println("--------------------\n");
    }

    /**
     * Check base type char
     */
    public static void BaseTypeChar() {
        //char c1 = true; // invalid
        //char c2 = false; // invalid
        char c3 = 'Z'; // valid
        char c4 = '\\'; // valid
        char c5 = 100; // valid, implicit casting
        char c6 = 10000; // valid, implicit casting
        char c7 = (char) 1000000; // explicit narrowing casting, does not fit in 16 bits
        char c8 = (char) 10000000000L; // explicit narrowing, does not fit in 16 bits
        char c9 = (char) 3.14f; // explicit narrowing casting, loss of precision
        char c10 = (char) 2.71828d; // explicit narrowing casting, loss of precision

        System.out.println("Output for characters:");

        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);
        System.out.println("c6: " + c6);
        System.out.println("c7: " + c7);
        System.out.println("c8: " + c8);
        System.out.println("c9: " + c9);
        System.out.println("c10: " + c10);

        System.out.println("c3 (as int): " + (int) c3);
        System.out.println("c4 (as int): " + (int) c4);
        System.out.println("c5 (as int): " + (int) c5);
        System.out.println("c6 (as int): " + (int) c6);
        System.out.println("c7 (as int): " + (int) c7);
        System.out.println("c8 (as int): " + (int) c8);
        System.out.println("c9 (as int): " + (int) c9);
        System.out.println("c10 (as int): " + (int) c10);

        System.out.println("--------------------\n");
    }

    /**
     * Check base type byte
     */
    public static void BaseTypeByte() {
        //byte b1 = true; // invalid
        //byte b2 = false; // invalid
        byte b3 = 'Z'; // valid, implicit casting
        byte b4 = '\\'; // valid, implicit casting
        byte b5 = 100; // valid
        byte b6 = (byte) 10000; // explicit narrowing casting, does not fit in 8 bits
        byte b7 = (byte) 1000000; // explicit narrowing casting, does not fit in 8 bits
        byte b8 = (byte) 10000000000L; // explicit narrowing casting, does not fit in 8 bits
        byte b9 = (byte) 3.14f; // explicit narrowing casting, loss of precision
        byte b10 = (byte) 2.71828d; // explicit narrowing casting, loss of precision

        System.out.println("Output for bytes:");

        System.out.println("b3: " + b3);
        System.out.println("b4: " + b4);
        System.out.println("b5: " + b5);
        System.out.println("b6: " + b6);
        System.out.println("b7: " + b7);
        System.out.println("b8: " + b8);
        System.out.println("b9: " + b9);
        System.out.println("b10: " + b10);

        System.out.println("--------------------\n");
    }

    /**
     * Check base type short
     */
    public static void BaseTypeShort() {
        //short s1 = true; // invalid
        //short s2 = false; // invalid
        short s3 = 'Z'; // valid, implicit casting
        short s4 = '\\'; // valid, implicit casting
        short s5 = 100; // valid
        short s6 = 10000; // valid
        short s7 = (short) 1000000; // explicit narrowing casting, does not fit in 16 bits
        short s8 = (short) 10000000000L; // explicit narrowing casting, does not fit in 16 bits
        short s9 = (short) 3.14f; // explicit narrowing casting, loss of precision
        short s10 = (short) 2.71828d; // explicit narrowing casting, loss of precision

        System.out.println("Output for shorts:");

        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);
        System.out.println("s6: " + s6);
        System.out.println("s7: " + s7);
        System.out.println("s8: " + s8);
        System.out.println("s9: " + s9);
        System.out.println("s10: " + s10);

        System.out.println("--------------------\n");
    }

    /**
     * Check base type int
     */
    public static void BaseTypeInt() {
        //int i1 = true; // invalid
        //int i2 = false; // invalid
        int i3 = 'Z'; // valid
        int i4 = '\\'; // valid
        int i5 = 100; // valid
        int i6 = 10000; // valid
        int i7 = 1000000; // valid
        int i8 = (int) 10000000000L; // explicit narrowing casting, does not fit in 32 bits
        int i9 = (int) 3.14f; // explicit narrowing casting, loss of precision
        int i10 = (int) 2.71828d; // explicit narrowing casting, loss of precision

        System.out.println("Output for integers:");

        System.out.println("i3: " + i3);
        System.out.println("i4: " + i4);
        System.out.println("i5: " + i5);
        System.out.println("i6: " + i6);
        System.out.println("i7: " + i7);
        System.out.println("i8: " + i8);
        System.out.println("i9: " + i9);
        System.out.println("i10: " + i10);

        System.out.println("--------------------\n");
    }

    /**
     * Check base type long
     */
    public static void BaseTypeLong() {
        //long l1 = true; // invalid
        //long l2 = false; // invalid
        long l3 = 'Z'; // valid
        long l4 = '\\'; // valid
        long l5 = 100; // valid
        long l6 = 10000; // valid
        long l7 = 1000000; // valid
        long l8 = 10000000000L; // valid
        long l9 = (long) 3.14f; // explicit narrowing casting, loss of precision
        long l10 = (long) 2.71828d; // explicit narrowing casting, loss of precision

        System.out.println("Output for longs:");

        System.out.println("l3: " + l3);
        System.out.println("l4: " + l4);
        System.out.println("l5: " + l5);
        System.out.println("l6: " + l6);
        System.out.println("l7: " + l7);
        System.out.println("l8: " + l8);
        System.out.println("l9: " + l9);
        System.out.println("l10: " + l10);

        System.out.println("--------------------\n");
    }

    /**
     * Check base type float
     */
    public static void BaseTypeFloat() {
        //float f1 = true; // invalid
        //float f2 = false; // invalid
        float f3 = 'Z'; // valid
        float f4 = '\\'; // valid
        float f5 = 100; // valid
        float f6 = 10000; // valid
        float f7 = 1000000; // valid
        float f8 = 10000000000L; // valid
        float f9 = 3.14f; // valid
        float f10 = (float) 2.71828d; // explicit narrowing casting, loss of precision

        System.out.println("Output for floats:");

        System.out.println("f3: " + f3);
        System.out.println("f4: " + f4);
        System.out.println("f5: " + f5);
        System.out.println("f6: " + f6);
        System.out.println("f7: " + f7);
        System.out.println("f8: " + f8);
        System.out.println("f9: " + f9);
        System.out.println("f10: " + f10);

        System.out.println("--------------------\n");
    }

    /**
     * Check base type double
     */
    public static void BaseTypeDouble() {
        //double d1 = true; // invalid
        //double d2 = false; // invalid
        double d3 = 'Z'; // valid
        double d4 = '\\'; // valid
        double d5 = 100; // valid
        double d6 = 10000; // valid
        double d7 = 1000000; // valid
        double d8 = 10000000000L; // valid
        double d9 = 3.14f; // valid
        double d10 = 2.71828d; // valid

        System.out.println("Output for doubles:");

        System.out.println("d3: " + d3);
        System.out.println("d4: " + d4);
        System.out.println("d5: " + d5);
        System.out.println("d6: " + d6);
        System.out.println("d7: " + d7);
        System.out.println("d8: " + d8);
        System.out.println("d9: " + d9);
        System.out.println("d10: " + d10);

        System.out.println("--------------------\n");
    }

    /**
     * Check base types in Java
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {
        System.out.println("Check base types:\n");
        baseTypeBoolean();
        BaseTypeChar();
        BaseTypeByte();
        BaseTypeShort();
        BaseTypeInt();
        BaseTypeLong();
        BaseTypeFloat();
        BaseTypeDouble();
    }

}
