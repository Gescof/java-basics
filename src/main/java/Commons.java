package main.java;

/**
 * This class provides common utility methods.
 */
public class Commons {

    private Commons() {
    } // Private constructor to prevent instantiation

    /**
     * Prints the initial lines for a test.
     */
    public static void printInitialLines() {
        System.out.println();
        System.out.println("----------------------");
    }

    /**
     * Prints a header for a test.
     *
     * @param testName the name of the test
     */
    public static void printTestHeader(String testName) {
        printInitialLines();
        System.out.println(testName);
    }
}