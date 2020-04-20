/*
Create the dynamic stack in Java by implementing the interfaces that defines push()
and pop() methods.
 */
package Problem4;
import java.util.ArrayList;



public class ListStack implements Stack{
    private ArrayList<Integer> stackArr;
    ListStack() {
        this.stackArr = new ArrayList<Integer>();
    }

    public boolean isEmpty() {
        return stackArr.size() == 0;
    }

    public int getSize(){
        return stackArr.size();
    }

    //Push function
    public boolean push(int element) {
        stackArr.add(element);
        return true;
    }

    //Pop function
    public int pop() {
        if(isEmpty()) return -1;
        int element = this.stackArr.remove(stackArr.size()-1);
        return element;
    }

    //Make a string
    public String toString(){
        ArrayList<String> s = new ArrayList<String>();
        stackArr.forEach(e->{
            s.add(e.toString());
        });
        return String.join(" ",s);
    }
    //Display function
    public void display() {
        System.out.println(toString());
        System.out.println("______");
    }
}

interface Stack{
    boolean push(int element);
    int pop();
    int getSize();
}