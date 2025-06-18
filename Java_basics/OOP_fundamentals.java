/*
 * Object-Oriented Programming (OOP) Fundamentals :
- Classes and Objects
  Class: Blueprint for creating objects.
  Object: Instance of a class.

- Constructors
  Special methods used to initialize objects.
  Same name as the class, no return type.

- Fields and Methods
  Fields: Variables inside a class.
  Methods: Functions inside a class.

# Four Pillars of OOP
1. Encapsulation:
Bundling data (fields) and methods that operate on the data into a single unit (class).
Use access modifiers (private, public, etc.) to control access.

2. Abstraction:
Hiding complex implementation details and showing only the necessary features.
Achieved using abstract classes and interfaces.

3. Inheritance:
One class (child) inherits fields and methods from another class (parent).
Use extends keyword.

4. Polymorphism:
Same method name behaves differently in different classes.
Achieved through method overriding and interfaces.

# Access Modifiers
public: Accessible from anywhere.
private: Accessible only within the class.
protected: Accessible within the package and subclasses.
Default (no modifier): Accessible within the package.
 */

 // Class definition
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Inheritance and Polymorphism
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " barks.");
    }
}

public class OOP_fundamentals {
    public static void main(String[] args) {
    
    }
}
