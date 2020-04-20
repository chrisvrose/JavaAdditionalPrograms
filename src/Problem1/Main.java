/*
Additional programs 1
Create a Java class called Problem1.Student with the following details as variables within it
        namely USN, Name, Branch, Phone. Write a Java program to create ‘n’ Problem1.Student objects
        and print the USN, Name, Branch, and Phone of these objects with suitable headings.
*/
package Problem1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students details?");
        int n = input.nextInt();
        Student[] students = new Student[n];
        String name, usn, branch, phno;

        for(int i=0;i<n;i++) {
            System.out.println("Enter name of Student "+(i+1));
            name = input.next();
            System.out.println("Enter usn of Student "+(i+1));
            usn = input.next();
            System.out.println("Enter branch of Student "+(i+1));
            branch = input.next();
            System.out.println("Enter phone # of Student "+(i+1));
            phno = input.next();

            students[i] = new Student(usn, name, branch, phno);
        }

        System.out.println("Details of students are: ");
        for(int i=0;i<n;i++) {
            System.out.println("Student "+(i+1));
            students[i].printDetails();
        }
        input.close();
    }
}