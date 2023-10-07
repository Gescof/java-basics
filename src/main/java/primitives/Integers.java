package main.java.primitives;

/**
 * This represents integers as primitive variables and values of Java.
 */
public class Integers {
    private Integers() {
    }

    /**
     * Integer variable and operations with it.
     */
    public static void firstTest() {
        System.out.println("----------------------");
        System.out.println("First test of Integers");

        // Defines int variable named 'x' and sets initial value to 0
        int x = 0;

        // Prints in a new line variable 'x'
        System.out.println(x);

        // Prints in a new line variable 'x', then incrementing it by 1
        System.out.println(x++);

        // Prints in a new line variable 'x', which was incremented by 1,
        // and it is incremented here by 1 before printed again
        System.out.println(++x);
    }

    /**
     * Sets of integer variables and operations with them.
     */
    public static void secondTest() {
        System.out.println("----------------------");
        System.out.println("Second test of Integers");

        // Defines int variable named 'x' and sets initial value to 0
        int x = 3;
        // Defines int variable named 'y' and sets initial value to 1
        int y = 4;

        // Prints in a new line addition of variables 'x' and 'y'
        System.out.println(x + y);

        // Prints in a new line subtraction of variables 'x' and 'y'
        System.out.println(x - y);

        // Prints in a new line multiplication of variables 'x' and 'y'
        System.out.println(x * y);

        // Prints in a new line division of variables 'y' and 'x'.
        // Note that the output result is another integer value
        System.out.println(y / x);
    }
}
