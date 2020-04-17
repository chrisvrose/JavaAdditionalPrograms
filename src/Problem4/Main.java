/*
Create the dynamic stack in Java by implementing the interfaces that defines push()
and pop() methods.
 */
package Problem4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What size of stack would be enough?");
        int size = input.nextInt();
        Stack stack = new Stack(size);
        Boolean choice = true;
        int option;
        while(choice) {
            System.out.println("What operations would you want to perform?\n1. Push\n2. Pop\n3. Display elements\n4. Exit");
            option = input.nextInt();

            switch(option) {
                case 1:
                    System.out.println("What would you like to push onto the stack?");
                    stack.push(input.nextInt());
                    System.out.println("Pushed!");
                    break;
                case 2:
		    int popped = stack.pop();
		    if(popped != -1)
                    	System.out.println(popped + " was popped from the stack");
                    break;
                case 3:
                    System.out.println("Current stack status");
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting!");
                    choice = false;
                    break;
                default:
                    System.out.println("Wrong choice entered! Try again");
                    break;
            }
        }
        System.out.println("This was the demonstration of dynamic stack implementation!");
    }
}
