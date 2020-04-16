/*
Write a program that reads in a series of first names and eliminates duplicates by storing
them in a Set. Allow the user to search for a first name.
 */
package Problem8;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of surnames. Enter \"q\" to stop.");
        String name;
        ArrayList<String> nameList = new ArrayList<>();

        do {
            name = input.next();
            if(name.equalsIgnoreCase("q"))
                break;
            else
                nameList.add(name);
        }while(true);

        System.out.println("List elements");
        for(String s: nameList) {
            System.out.println(s);
        }
        System.out.println("\n");

        Set<String> firstNames = new HashSet<String>(nameList);

        System.out.println("Unique set elements");
        for(String s: firstNames) {
            System.out.println(s);
        }
        System.out.println("\n");

        ArrayList<String> names = new ArrayList<String>(firstNames);
        System.out.println("Enter first name to search in the set: ");
        name = input.next();
        Boolean flag = false;
        int pos = 0;
        for(String s:names) {
            pos += 1;
            if(s.equalsIgnoreCase(name)) {
                flag = true;
                break;
            }
        }

        if(flag)
            System.out.println(name+" was found in position "+pos);
        else
            System.out.println(name+" is not in the set");
    }
}
