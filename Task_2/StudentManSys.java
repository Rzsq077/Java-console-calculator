package Task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManSys {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        students.add(new Student(studentId, studentName, marks));
        System.out.println("✅ Student added successfully!");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠ No students found.");
            return;
        }
        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getId() == studentId) {
                System.out.print("Enter new name: ");
                String newName = sc.nextLine();
                System.out.print("Enter new marks: ");
                double newMarks = sc.nextDouble();

                s.setName(newName);
                s.setMarks(newMarks);

                System.out.println("✅ Student updated successfully!");
                return;
            }
        }
        System.out.println("⚠ Student not found.");
    }

    public static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int studentId = sc.nextInt();

        for (Student s : students) {
            if (s.getId() == studentId) {
                students.remove(s);
                System.out.println("🗑 Student deleted successfully!");
                return;
            }
        }
        System.out.println("⚠ Student not found.");
    }

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("=== Student Record Management System ===");

        while (running) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("⚠ Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
