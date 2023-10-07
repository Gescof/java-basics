package main.java.primitives;

import main.java.Commons;

/**
 * This represents characters as primitive and String variables and values of Java.
 */
public class Characters {
    private Characters() {
    }

    /**
     * Types of characters and operations with them.
     */
    public static void firstTest() {
        Commons.printInitialLines();
        System.out.println("First test of Characters");

        // Defines char variable named 'x' and sets initial value to 'a'.
        // A char contains a character representation of maximum 16 bits
        char x = 'a';

        // Prints in a new line variable 'x'
        System.out.println("x: " + x);

        // Prints in a new line variable 'x', which is incremented by 1.
        // In char, this means that the character printed will be the next in position following UTF-16 code units
        System.out.println("++x: " + ++x);

        // It is possible to store an integer value in a char type.
        // This is because a char contains an unsigned integer (positive integer) that represents a UTF-16 code unit
        char y = 64;
        System.out.println("y: " + y);
    }

    /**
     * String class and operations with it.
     */
    public static void secondTest() {
        Commons.printInitialLines();
        System.out.println("Second test of Characters");

        // Defines variable as String type named 'x' and sets initial value. A String represents character strings.
        // All string literals in Java are implemented as instances of this class
        String x = "This is a String";
        System.out.println("String x: " + x);

        // A String could be defined as an array of characters, since each character of a string is a char.
        // You could represent a string as follows
        char[] y = new char[]{'a', 'b', 'c'};
        System.out.println(y);

        // The String class has methods of utility
        System.out.println("x to upper case: " + x.toUpperCase());
        System.out.println("x to lower case: " + x.toLowerCase());
        System.out.println("x replace 's' with '&': " + x.replace("s", "&"));
        System.out.println("x character at index 1: " + x.charAt(1));
        System.out.println("x substring from index 1: " + x.substring(1));
    }
}
