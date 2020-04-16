/*
Write a Java Program to print the multiples of 7, 8 alternatively to demonstrate the
concept of inter-thread communication.
 */
package Problem7;

public class Eights extends Thread {
    Main m;
    final int n = 8;
    Eights(Main m) {
        this.m = m;
    }

    @Override
    public void run() {
        m.printTable(n);
    }
}
