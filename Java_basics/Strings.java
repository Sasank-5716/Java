/*
 * Strings and Basic I/O (7–9 hours)
Theory
String Class
Strings in Java are objects (not primitive types).
Created using double quotes: String name = "Java";
StringBuilder/StringBuffer: Used for mutable strings (when you need to modify the string frequently).

Common String Operations
.length(), .charAt(), .substring(), .equals(), .compareTo(), .concat()

Example:
String s = "Hello";
System.out.println(s.length()); // 5
System.out.println(s.substring(1, 4)); // "ell"

Basic Input/Output
Use Scanner for input from the keyboard.
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
int num = sc.nextInt();
 */

 import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        String s1 = "Java";
        String s2 = "Programming";
        String s3 = s1 + " " + s2;
        System.out.println(s3.toUpperCase());
    }
}
