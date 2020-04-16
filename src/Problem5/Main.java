/*
Write a Java program to demonstrate the following. A company pays its employees
weekly. The employees are of three types.
a) Salaried employees are paid a fixed weekly salary regardless of the number of
hours worked.
b) Commission employees are paid a percentage of their sales and
c) Base_salary_plus_commission employees receive a base salary plus percentage
of their sales.
For the current pay period, the company has decided a reward for
base_salary_plus_commission employees by adding 10 percent to their base salaries.
The company wants to implement a Java program that performs its payroll calculations
polymorphically. Design and implement the program using inheritance. Implement the
methods to read and write the employee details (like name, emp_id, salary, etc), to
compute the employee‘s gross salary.
 */
package Problem5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, empid;

        System.out.println("Enter Salaried Employee details: ");
        System.out.println("Name: ");
        name = input.next();
        System.out.println("Employee ID: ");
        empid = input.next();
        System.out.println("Salary: ");
        Salaried_Employee salaried_employee = new Salaried_Employee(name, empid, input.nextLong());
        System.out.println("The salary for the employee is "+salaried_employee.getSalary());


        System.out.println("Enter Commission Employee details: ");
        System.out.println("Name: ");
        name = input.next();
        System.out.println("Employee ID: ");
        empid = input.next();
        System.out.println("Sales: ");
        Commission_Employee commission_employee = new Commission_Employee(name, empid, input.nextLong());
        System.out.println("The salary for the commission employee is "+commission_employee.getSalary());


        System.out.println("Enter Base + Commission Employee details: ");
        System.out.println("Name: ");
        name = input.next();
        System.out.println("Employee ID: ");
        empid = input.next();
        System.out.println("Base salary: ");
        long base = input.nextLong();
        System.out.println("Sales: ");
        BplusC_Employee bplusC_employee = new BplusC_Employee(name, empid, base, input.nextLong());
        System.out.println("The salary for the Base plus Commission employee is "+bplusC_employee.getSalary());
    }
}
