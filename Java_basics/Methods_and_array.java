/* 
Methods
Definition: A method is a block of code that performs a specific task and can be called (invoked) from elsewhere in your program.

Syntax:
returnType methodName(parameters) {
    // code
    return value; // if returnType is not void
}


Method Overloading
Defining multiple methods with the same name but different parameters.

Example:
int add(int a, int b) { return a + b; }
double add(double a, double b) { return a + b; }
Recursion
A method that calls itself.
Useful for problems that can be broken down into similar subproblems.


Arrays
Definition: Arrays are containers that hold a fixed number of values of a single type.

Declaration:
int[] numbers = new int[5]; // 1D array
int[][] matrix = new int[3][3]; // 2D array
*/

public class Methods_and_array {
    // Method to calculate sum of array elements
        static int sumArray(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }
    
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Sum: " + sumArray(numbers));
        }
    }
 

