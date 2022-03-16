/*
~ File Name: Egg2.java
~ File Purpose: Egg2.java is a solution for BJP5 Exercise 1.10: Egg2. The prompt is below.
Write a complete Java program in a class named Egg2 that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
~ Problem solving approach:
This question involves reusing the top/middle/bottom shapes of the egg, the best course 
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
OBJ1. Create a class named Egg2.
OBJ2. Create a main method.
OBJ3. Create a method that will print the top shape.
OBJ4. Create a method that will print the middle shape.
OBJ5. Create a method that will print the bottom shape.
OBJ6. Call the methods corresponding with each component to form the desired shape. 
*/

public class Egg2 {  // OBJ1
    public static void main(String[] args) {  // OBJ2
        // OBJ6 is the repeated method calls below:
        top();  // Call the method for the top
        bottom();  // Call the method for the bottom
        middle();  // Call the method for the middle
        top();  // Call the method for the top
        bottom();  // Call the method for the bottom
        middle();  // Call the method for the middle
        bottom();  // Call the method for the bottom
        top();  // Call the method for the top
        middle();  // Call the method for the middle
        bottom();  // Call the method for the bottom
    }
    public static void top() {  // OBJ3
        System.out.println("  _______");
        System.out.println(" /       \\"); 
        System.out.println("/         \\");
    }
    public static void middle() {  // OBJ4
        System.out.println("-\"-'-\"-'-\"-"); 
    }
    public static void bottom() {  // OBJ5
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    
}
