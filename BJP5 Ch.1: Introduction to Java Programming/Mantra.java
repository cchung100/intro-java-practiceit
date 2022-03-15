/*
~ File Name: Mantra.java
~ File Purpose: Mantra.java is a solution for BJP5 Exercise 1.7: Mantra. The prompt is below.
Write a complete Java program in a class named Mantra that produces the following output. 
Remove its redundancy by adding a method.
There's one thing every coder must understand:
The System.out.println command.

There's one thing every coder must understand:
The System.out.println command.
~ Break the problem into objectives:
OBJ1. Create a class named Mantra.
OBJ2. Create a main method.
OBJ3. Create a method that will print the message.
OBJ4. Call the method as many times as necessary in the main method. 
*/

public class Mantra {   // OBJ1
    public static void main(String[] args) {  // OBJ2, making the main
        mantraMethod(); // OBJ4, first call to mantraMethod
        System.out.println(); // Add an empty line between calls to get the desired output
        mantraMethod(); // OBJ4, calling mantraMethod again
    }
    // OBJ3
    public static void mantraMethod() {
        System.out.println("There's one thing every coder must understand:");
        System.out.println("The System.out.println command.");
    }
}
