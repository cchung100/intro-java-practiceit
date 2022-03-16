/*
~ File Name: Stewie2.java
~ File Purpose: Stewie2.java is a solution for BJP5 Exercise 1.8: Stewie2. The prompt is below.
Write a complete Java program in a class named Stewie2 that prints the following output. 
Use at least one static method besides main to remove redundancy.
//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
~ Break the problem into objectives:
OBJ1. Create a class named Stewie2.
OBJ2. Create a main method.
OBJ3. Create a static method that prints the message.
OBJ4. Call the method as many times as necessary in the main method. 
*/

public class Stewie2 {  // OBJ1
    public static void main(String[] args) {  // OBJ2
        System.out.println("//////////////////////");
        // OBJ4, calling the method repeatedly
        repeat();
        repeat();
        repeat();
        repeat();
        repeat();
    }
    public static void repeat() {  // OBJ3
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
