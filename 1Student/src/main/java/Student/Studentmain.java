package Student;

import java.util.Scanner;

public class Studentmain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            System.out.println("************** STUDENT DETAILS SYSTEM ************");
            System.out.println("\n1. CREATE STUDENT RECORDS");
            System.out.println("2. VIEW STUDENT BY REG NO.");
            System.out.println("3. VIEW ALLSTUDENT DETAILS.  ");
            System.out.println("4. UPDATE STUDENT RECORD.");
            System.out.println("5. EXIT");
            System.out.println("\nENTER YOUR OPTION:");
            option = scan.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter student details to create a new record:");
                    System.out.print("Enter Name: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scan.nextLine();
                    System.out.print("Enter Section: ");
                    String section = scan.nextLine();
                    System.out.print("Enter Reg No: ");
                    int regNo = scan.nextInt();

                    StudentAssignment.createStudentRecord(name, dept, section, regNo);
                    break;

                case 2:
                    System.out.println("Enter REG. NO of STUDENT:");
                    int regNoToView = scan.nextInt();
                    StudentAssignment.viewStudentByRegno(regNoToView);
                    break;


                case 3:
                    StudentAssignment.viewAllStudents();

                    break;

                case 4:
                    System.out.println("Enter REG NO of student to update:");
                    int regNoToUpdate = scan.nextInt();
                    scan.nextLine(); // consume newline
                    System.out.println("Enter new Name: ");
                    String newName = scan.nextLine();
                    System.out.println("Enter new Department: ");
                    String newDept = scan.nextLine();
                    System.out.println("Enter new Section: ");
                    String newSection = scan.nextLine();

                    StudentAssignment.updateStudentRecord(regNoToUpdate, newName, newDept, newSection);
                    break;

                case 5:
                    System.out.println("Exiting the student details management system.");
                    break;

                default:

                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 5);

        scan.close();
    }
}
