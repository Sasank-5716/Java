/*
1. Structure of a Java program:
-Every Java program has at least one class.
-The entry point is the main method:
public static void main(String[] args)

2. Variables and Data Types:
-Variables store data.
Primitive types:
    -int (integer numbers)
    -double (decimal numbers)
    -char (single characters)
    -boolean (true/false)
    -byte, short, long, float (other numeric types)

3. Operators:
    -Arithmetic: +, -, *, /, %
    -Relational: ==, !=, >, <, >=, <=
    -Logical: && (and), || (or), ! (not)
 */

public class javaBasics {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        boolean isGreater = a > b;
        System.out.println("Is a greater than b? " + isGreater);
    }
}
