import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Student class to store student data
class Student {
    private int id;
    private String name;
    private String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

class StudentManager {
    private List<Student> students = new ArrayList<>();
    private int nextId = 1;

    public void addStudent(String name, String grade) {
        students.add(new Student(nextId++, name, grade));
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            students.forEach(System.out::println);
        }
    }

    // Update a student's details by ID
    public void updateStudent(int id, String newName, String newGrade) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setGrade(newGrade);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Error: Student with ID " + id + " not found.");
    }

    public void deleteStudent(int id) { // <-- UPDATED
        if (students.removeIf(s -> s.getId() == id)) { // <-- UPDATED
            System.out.println("Student deleted successfully!"); // <-- UPDATED
        } else {
            System.out.println("Error: Student with ID " + id + " not found."); // <-- UPDATED
        }
    }

    public void searchStudent(String name) { // <-- UPDATED
        List<Student> results = students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .toList();

        if (results.isEmpty()) {
            System.out.println("No students found with name: " + name); // <-- UPDATED
        } else {
            System.out.println("\n--- SEARCH RESULTS ---");
            results.forEach(System.out::println);
        }
    }
}

// Main class to run the program
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student by Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    String grade = scanner.nextLine();
                    manager.addStudent(name, grade); // <-- UPDATED
                    break;

                case 2: // View Students
                    manager.viewStudents();
                    break;

            }
        }
    }
}
