package main.java.primitives;

import main.java.Commons;

/**
 * This class represents numbers as primitive variables and values of Java.
 */
public class Numbers {

    private Numbers() {
    } // Private constructor to prevent instantiation

    /**
     * Demonstrates the usage of different integer types and their operations.
     */
    public static void demonstrateIntegerTypes() {
        Commons.printTestHeader("Demonstrating Integer Types");

        // Define integer variables
        int intVariable = 0;
        byte byteVariable = 9;
        short shortVariable = 123;
        long longVariable = 9876;

        // Perform operations and print results
        printIntegerOperations(intVariable, byteVariable, shortVariable, longVariable);
    }

    /**
     * Demonstrates the usage of decimal variables and their operations.
     */
    public static void demonstrateDecimalTypes() {
        Commons.printInitialLines();
        System.out.println("Demonstrating Decimal Types");

        // Define decimal variables
        float floatVariable = 3f;
        double doubleVariable = 4.5;

        // Perform operations and print results
        printDecimalOperations(floatVariable, doubleVariable);
    }

    /**
     * Prints the results of integer operations.
     *
     * @param intVariable   the int variable
     * @param byteVariable  the byte variable
     * @param shortVariable the short variable
     * @param longVariable  the long variable
     */
    private static void printIntegerOperations(int intVariable, byte byteVariable, short shortVariable, long longVariable) {
        System.out.println("Integer Operations:");
        System.out.println("intVariable: " + intVariable);
        System.out.println("byteVariable: " + byteVariable);
        System.out.println("shortVariable: " + shortVariable);
        System.out.println("longVariable: " + longVariable);

        // Perform and print additional operations
        int result = (int) (byteVariable - shortVariable + longVariable);
        System.out.println("byteVariable - shortVariable + longVariable: " + result);
        result -= (result + 1) * 2;
        System.out.println("result: " + result);
    }

    /**
     * Prints the results of decimal operations.
     *
     * @param floatVariable  the float variable
     * @param doubleVariable the double variable
     */
    private static void printDecimalOperations(float floatVariable, double doubleVariable) {
        System.out.println("Decimal Operations:");
        System.out.println("floatVariable: " + floatVariable);
        System.out.println("doubleVariable: " + doubleVariable);

        // Perform and print additional operations
        System.out.println("floatVariable + doubleVariable: " + (floatVariable + doubleVariable));
        System.out.println("floatVariable - doubleVariable: " + (floatVariable - doubleVariable));
        System.out.println("floatVariable * doubleVariable: " + (floatVariable * doubleVariable));
        System.out.println("doubleVariable / floatVariable: " + (doubleVariable / floatVariable));
    }
}