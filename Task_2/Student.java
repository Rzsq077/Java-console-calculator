package Task_2;

import java.util.*;
import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private double marks;

    // Creating Consturctor of Student Class
    public Student(int studentId, String studentName, double studentMarks) {
        id = studentId;
        name = studentName;
        marks = studentMarks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setMarks(double newMarks) {
        marks = newMarks;
    }

    @Override

    public String toString() {
        return "ID : " + id + " : Name : " + name + " : Marks : " + marks;
    }
}
