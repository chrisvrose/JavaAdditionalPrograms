/*
(b) Write a Java program to read two integers a and b. Compute a/b and print, when b
is not zero. Raise an exception when b is equal to zero.
*/
package Problem6b;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a for operation a/b");
        int a = input.nextInt();
        System.out.println("Enter b for operation a/b");
        int b = input.nextInt();

        try {
            if(b==0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            else {
                System.out.println("Division of a by b is "+((float)a/b));
            }
        }
        catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
    }
}
