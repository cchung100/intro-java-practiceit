/*
~ File Name: Difference.java
~ File Purpose: Difference.java is a solution for BJP5 Exercise 1.4: Difference. The prompt is below.
Write a complete Java program in a class named Difference that prints the following output:
What is the difference between
a ' and a "?  Or between a " and a \"?

One is what we see when we're typing our program.
The other is what appears on the "console."
~ Break the problem into objectives:
OBJ1. Create a class named Difference.
OBJ2. Create a main method.
OBJ3. Print the message in the main method.
*/

public class Difference {   // OBJ1
    public static void main(String[] args) {  // OBJ2
        // OBJ3 is the println statement below
        System.out.println("What is the difference between\na ' and a \"?  Or between a \" and a \\\"?\n\nOne is what we see when we're typing our program.\nThe other is what appears on the \"console.\"");
       // To show more examples of escape sequences, I wrote a single statement with multiple \n (new line) instead of a series of printlns.
        System.out.println("");
    }
}
