/*Control Flow Statements 
Conditional Statements:

if, else if, else control flow based on conditions.

switch allows multi-way branching based on a variable.

Loops:

for loop: repeats a block a fixed number of times.

while loop: repeats while a condition is true.

do-while loop: executes at least once, then repeats while condition is true.

Enhanced for loop: used to iterate over arrays or collections.

Control Keywords:

break: exits a loop or switch.

continue: skips current iteration.

return: exits a method.
*/

public class Controlflow_statements {
    public static void main(String[] args) {
        int number = 5;

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
