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

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, empid;
        System.out.println("Enter number of employees");
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee holder;
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Employee Profile:\n1.Salaried\n2.Commission\n3.Salaried+Commissioned");
            int choice = input.nextInt();
            if ((choice < 4 && choice > 0)) {
                System.out.println("Invalid. Reverting to default");
                choice = 1;
            }

            System.out.println("Name: ");
            name = input.next();
            System.out.println("Employee ID: ");
            empid = input.next();

            switch (choice) {
                case 1:
                    System.out.println("Salary: ");
                    holder = new Salaried_Employee(name, empid, input.nextLong());
                    break;
                case 2:
                    System.out.println("Sales: ");
                    holder = new Commission_Employee(name, empid, input.nextLong());
                    break;
                case 3:
                    System.out.println("Base salary: ");
                    long base = input.nextLong();
                    System.out.println("Sales: ");
                    holder = new BplusC_Employee(name, empid, base, input.nextLong());
                default:
                    holder = null;
            }
            employees.add(holder);
            // System.out.println("The salary for the employee is " +
            // salaried_employee.getSalary());
        }

        //Time for increasing the salary. for changes, just modify the Visitor.
        EmployeeVisitor ev = new EmployeeVisitor();
        employees.forEach((e)->{
            //This visitor will bump up salaries as required
            ev.visit(e);
            System.out.println("Name:"+e.getName());
            System.out.println("ID:"+e.getEmployeeID());
            System.out.println("Base Salary:"+e.getSalary());
            System.out.println("Total Salary"+e.getTotalSalary());
        });
        
        input.close();

    }
}
