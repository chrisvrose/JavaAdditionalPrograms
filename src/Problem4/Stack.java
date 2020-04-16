/*
Create the dynamic stack in Java by implementing the interfaces that defines push()
and pop() methods.
 */
package Problem4;

public class Stack {
    int[] stackArr;
    int stackSize;
    int top;

    Stack(int stackSize) {
        this.stackSize = stackSize;
        this.top = -1;
        this.stackArr = new int[stackSize];
    }

    private Boolean isFull() {
        return top == stackSize;
    }

    private Boolean isEmpty() {
        return top == -1;
    }

    //Push function
    public void push(int element) {
        if(isFull()) {
            System.out.println("Stack overflow! Cannot push element");
            return;
        }
        this.top += 1;
        this.stackArr[this.top] = element;
    }

    //Pop function
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack underflow! Cannot pop element");
            return -1;
        }
        int element = this.stackArr[this.top];
        this.top -= 1;
        return element;
    }

    //Display function
    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArr[i]);
        }
        System.out.println("______");
    }
}