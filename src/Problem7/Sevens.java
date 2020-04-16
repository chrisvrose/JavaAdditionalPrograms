/*
Write a Java Program to print the multiples of 7, 8 alternatively to demonstrate the
concept of inter-thread communication.
 */
package Problem7;

public class Sevens extends Thread {
    Main m;
    final int n = 7;
    Sevens (Main m) {
        this.m = m;
    }

    @Override
    public void run() {
        m.printTable(n);
    }
}
