/*
Write a Java Program to print the multiples of 7, 8 alternatively to demonstrate the
concept of inter-thread communication.
 */
package Problem7;

public class Main {
    final int limit = 10;
    public static void main(String[] args) {
        Main m = new Main();
        Sevens seven = new Sevens(m);
        Eights eight = new Eights(m);
        seven.start();
        eight.start();
    }

    public synchronized void printTable(int n) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(n +" * "+ "i" + " = "+n*i);
            notify();
            try {
                wait();
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
