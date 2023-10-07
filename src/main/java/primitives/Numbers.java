package main.java.primitives;

/**
 * This represents numbers as primitive variables and values of Java.
 */
public class Numbers {
    private Numbers() {
    }

    /**
     * Types of integers and operations with them.
     */
    public static void firstTest() {
        System.out.println("----------------------");
        System.out.println("First test of Numbers");

        // Defines int variable named 'x' and sets initial value to 0.
        // An int contains an integer representation of maximum 32 bits
        int x = 0;

        // Prints in a new line variable 'x'
        System.out.println("x: " + x);

        // Prints in a new line variable 'x', then incrementing it by 1
        System.out.println("x++: " + x++);

        // Prints in a new line variable 'x', which was incremented by 1,
        // and it is incremented here by 1 before printed again
        System.out.println("++x: " + ++x);

        // Other types of integers representations.
        // -> byte represents an integer of maximum 8 bits
        // -> short represents an integer of maximum 16 bits
        // -> long represents an integer of maximum 64 bits
        byte y = 9;
        short z = 123;
        long w = 9876;

        // It is possible to concatenate operations between these types and represent the result as another type.
        // Beware this could lead to "Overflow" or "Underflow" errors if the result is too big or too small
        // to be represented by the variable. For example, trying to represent a 16 bits integer in a byte (8 bits)
        int result = (int) (y - z + w);
        System.out.println("y - z + w: " + result);

        // Finally, we may want to concatenate operations as follows
        result -= (result + 1) * 2;
        System.out.println("result: " + result);
    }

    /**
     * Types of decimal variables and operations with them.
     */
    public static void secondTest() {
        System.out.println("----------------------");
        System.out.println("Second test of Numbers");

        // Defines decimal variable as float type named 'x' and sets initial value to 3.
        // A float contains a decimal representation of maximum 32 bits
        float x = 3f;
        // Defines double variable named 'y' and sets initial value to 4.5.
        // A float contains a decimal representation of maximum 64 bits
        double y = 4.5;

        // Prints in a new line addition of variables 'x' and 'y'
        System.out.println("x + y: " + (x + y));

        // Prints in a new line subtraction of variables 'x' and 'y'
         System.out.println("x - y: " + (x - y));

        // Prints in a new line multiplication of variables 'x' and 'y'
        System.out.println("x * y: " + (x * y));

        // Prints in a new line division of variables 'y' and 'x'.
        // Note that the output result is another integer value
        System.out.println("y / x: " + (y / x));
    }
}
