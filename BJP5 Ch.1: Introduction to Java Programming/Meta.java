/*
~ File Name: Meta.java
~ File Purpose: Meta.java is a solution for BJP5 Exercise 1.6: Meta. The prompt is below.
Write a complete Java program in a class named Meta that prints the following output:
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
~ Break the problem into objectives:
OBJ1. Create a class named Meta.
OBJ2. Create a main method.
OBJ3. Print the message in the main method.
*/

public class Meta {   // OBJ1
    public static void main(String[] args) { // OBJ2
        // OBJ 3 is the println statements below. I chose to write multiple printlns instead of using the single one with multiple \n. 
        System.out.println("public class Hello {");
        System.out.println("    public static void main(String[] args) {"); // Don't use \t. That produces 8 spaces, not 4.
        System.out.println("        System.out.println(\"Hello, world!\");");
        System.out.println("    }");
        System.out.println("}");
    }
}
