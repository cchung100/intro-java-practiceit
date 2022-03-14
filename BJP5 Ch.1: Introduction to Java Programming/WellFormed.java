/*
~ File Name: WellFormed.java
~ File Purpose: WellFormed.java is a solution for BJP5 Exercise 1.3: WellFormed. The prompt is below.
Write a complete Java program in a class named WellFormed that prints the following output:
A well-formed Java program has
a main method with { and }
braces.

A System.out.println statement
has ( and ) and usually a
String that starts and ends
with a " character.
(But we type \" instead!)
~ Break the problem into objectives:
OBJ1. Create a class named WellFormed.
OBJ2. Create a main method.
OBJ3. Print the message in the main method.
*/

public class WellFormed {   // OBJ1
    public static void main(String[] args) {  // OBJ2
        // OBJ3 is the println statement below
        System.out.println("A well-formed Java program has\na main method with { and }\nbraces.\n\nA System.out.println statement\nhas ( and ) and usually a\nString that starts and ends\nwith a \" character.\n(But we type \\\" instead!)");
       // To show more examples of escape sequences, I wrote a single statement with multiple \n (new line) instead of a series of printlns.
    }
}
