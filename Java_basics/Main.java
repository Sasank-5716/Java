import java.util.ArrayList;
import java.util.List;

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

    public int getId() { return id; }
    public String getName() { return name; }
    public String getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

class Student_management_system {
    private List<Student> students = new ArrayList<>();

    // Add a new student
    public void addStudent(Student student) {
        students.add(student);
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
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
       // Search student by name
    public Student searchStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
}
// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Student_management_system sms = new Student_management_system();

        // Sample students
        sms.addStudent(new Student(1, "Alice", "A"));
        sms.addStudent(new Student(2, "Bob", "B"));
        sms.addStudent(new Student(3, "Ramesh", "B+"));
        sms.addStudent(new Student(4, "Sanjay", "A-"));
    }}
