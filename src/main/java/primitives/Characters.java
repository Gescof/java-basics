package main.java.primitives;

import main.java.Commons;

/**
 * This class represents characters as primitive and String variables and values of Java.
 */
public class Characters {

    private Characters() {
    } // Private constructor to prevent instantiation

    /**
     * Demonstrates the usage of character types and their operations.
     */
    public static void demonstrateCharacterTypes() {
        Commons.printTestHeader("Demonstrating Character Types");

        // Define character variables
        char charVariable = 'a';
        String stringVariable = "This is a String";

        // Perform operations and print results
        printCharacterOperations(charVariable);
        printStringOperations(stringVariable);
    }

    /**
     * Prints the results of character operations.
     *
     * @param charVariable the char variable
     */
    private static void printCharacterOperations(char charVariable) {
        System.out.println("Character Operations:");
        System.out.println("charVariable: " + charVariable);
        System.out.println("Incremented charVariable: " + ++charVariable);

        // Store an integer value in a char type
        char integerStoredInChar = 64;
        System.out.println("Integer stored in char: " + integerStoredInChar);
    }

    /**
     * Prints the results of string operations.
     *
     * @param stringVariable the string variable
     */
    private static void printStringOperations(String stringVariable) {
        System.out.println("String Operations:");
        System.out.println("stringVariable: " + stringVariable);

        // Define a string as an array of characters
        char[] charArray = new char[]{'a', 'b', 'c'};
        System.out.println("charArray: " + new String(charArray));

        // Perform string operations
        System.out.println("stringVariable to upper case: " + stringVariable.toUpperCase());
        System.out.println("stringVariable to lower case: " + stringVariable.toLowerCase());
        System.out.println("stringVariable replace 's' with '&': " + stringVariable.replace("s", "&"));
        System.out.println("stringVariable character at index 1: " + stringVariable.charAt(1));
        System.out.println("stringVariable substring from index 1: " + stringVariable.substring(1));
    }
}