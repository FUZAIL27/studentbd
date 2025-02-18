
package Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAssignment {
    // HashMap to store students by their regno (unique key)
    private static HashMap<Integer, Studentdemo> studentMap = new HashMap<>();



    // Method to create a new student record
    public static void createStudentRecord(String name, String dept, String section, int regno) {
        if (studentMap.containsKey(regno)) {
            System.out.println("Student with this Reg No already exists.");
        } else {
            Studentdemo newStudent = new Studentdemo(name, dept, section, regno);
            studentMap.put(regno, newStudent);
            System.out.println("Student record created successfully.");
        }
    }

    // Method to view student regno
    public static void viewStudentByRegno(int regno) {
        Studentdemo student = studentMap.get(regno);
        if (student != null) {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.printf("%-20s%-15s%-15s%-15s\n", "NAME", "DEPT", "REGNO", "SECTION");
            System.out.println("--------------------------------------------------");
            System.out.println(student);
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("No student found with Reg No: " + regno);
        }
    }

    // Method to view all student details
    public static void viewAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.printf("%-20s%-15s%-15s%-15s\n", "NAME", "DEPT", "REGNO", "SECTION");
            System.out.println("--------------------------------------------------");
            for (Studentdemo student : studentMap.values()) {
                System.out.println(student);
                System.out.println("--------------------------------------------------");
            }
        }
    }


    // Method to update student record
    public static void updateStudentRecord(int regno, String name, String dept, String section) {
        Studentdemo student = studentMap.get(regno);
        if (student != null) {
            studentMap.put(regno, new Studentdemo(name, dept, section, regno));
            System.out.println("Student record updated successfully.");
        } else {
            System.out.println("No student found with Reg No: " + regno);
        }
    }


}


