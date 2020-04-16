/*
Additional programs 1
Create a Java class called Problem1.Student with the following details as variables within it
        namely USN, Name, Branch, Phone. Write a Java program to create ‘n’ Problem1.Student objects
        and print the USN, Name, Branch, and Phone of these objects with suitable headings.
*/
package Problem1;
public class Student {
    String USN;
    String Name;
    String Branch;
    String PhoneNo;

    Student (String usn, String name, String branch, String phno) {
        this.USN = usn;
        this.Name = name;
        this.Branch = branch;
        this.PhoneNo = phno;
    }

    public void printDetails () {
        System.out.println("Name: "+this.Name);
        System.out.println("USN: "+this.USN);
        System.out.println("Branch: "+this.Branch);
        System.out.println("Phone number: "+this.PhoneNo);
    }
}

