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

public class Salaried_Employee extends Employee {

    Salaried_Employee(String name, String empid, long salary) {
        super(name, empid);
        super.salary = salary;
    }

    public long getSalary() {
        return salary;
    }
}
