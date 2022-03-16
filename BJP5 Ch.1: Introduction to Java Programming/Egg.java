/*
~ File Name: Egg.java
~ File Purpose: Egg.java is a solution for BJP5 Exercise 1.9: Egg. The prompt is below.
Write a complete Java program in a class named Egg that displays the following output:
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
~ Problem solving approach:
Based on the fact that future questions will involve reusing the top/middle/bottom shapes, the best course 
of action is to create a method for each major component of the shape:
A top:
  _______
 /       \
/         \
A middle:
-"-'-"-'-"-
and a bottom:
\         /
 \_______/
~ Break the problem into objectives:
OBJ1. Create a class named Egg.
OBJ2. Create a main method.
OBJ3. Create a method that will print the top shape.
OBJ4. Create a method that will print the middle shape.
OBJ5. Create a method that will print the bottom shape.
OBJ6. Call the methods in the main method to form the egg. 
*/
public class Egg {  // OBJ1
    public static void main(String[] args) {  // OBJ2
       // OBJ6, calling the methods
        top();  // Call the method for the top
        middle();  // Call the method for the middle
        bottom();  // Call the method for the bottom
    }
    public static void top() {  // OBJ3
        System.out.println("  _______");
        System.out.println(" /       \\"); // Don't forget how to display backslashes
        System.out.println("/         \\");
    }
    public static void middle() {  // OBJ4
        System.out.println("-\"-'-\"-'-\"-"); // Be mindful of escape sequences
    }
    public static void bottom() {  // OBJ5
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    
}
