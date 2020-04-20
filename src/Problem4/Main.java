/*
Create the dynamic stack in Java by implementing the interfaces that defines push()
and pop() methods.
 */
package Problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListStack stack = new ListStack();
        boolean choice = true;
        int option;
        while (choice) {
            System.out.println("What operations would you want to perform?\n1. Push\n2. Pop\n3. Display elements\n0. Exit");
            option = input.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Exiting!");
                    choice = false;
                    break;
                case 1:
                    System.out.println("What would you like to push onto the stack?");
                    try{
                        stack.push(input.nextInt());
                        System.out.println("Pushed");
                    }catch(Exception e){
                        System.out.println("Stack overflow");
                    }
                    break;
                case 2:
                    int popped = stack.pop();
                    if(popped==-1){
                        System.out.println("Underflow");    
                    }else{
                    System.out.println(popped + " popped");}
                case 3:
                    System.out.println("Current stack status");
                    stack.display();
                    break;
                default:
                    System.out.println("Wrong choice entered! Try again");
                    break;
            }
        }
        input.close();
    }
}
