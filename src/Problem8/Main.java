/*
Write a program that reads in a series of first names and eliminates duplicates by storing
them in a Set. Allow the user to search for a first name.
 */
package Problem8;

import java.util.*;

public class Main {
    static void sop(String s) {
        System.out.println(s);
    }

    static String menu = "1.Menu\n 2.Add name\n3.Remove name\n4.Search name\n0.Exit\n";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ArrayList<String> nameList = new ArrayList<>();
        sop(menu);
        TreeSet<String> nameList = new TreeSet<String>();
        int choice;

        while ((choice = input.nextInt()) > 0) {
            switch (choice) {
                case 0:
                    break;
                case 1:
                    sop(menu);
                    break;
                case 2:
                    sop("Add name");
                    if (!nameList.add(input.next())) {
                        System.out.println("Tried to add duplicate");
                    }
                    break;
                case 3:
                    sop("Remove name");
                    if (nameList.remove(input.next())) {
                        sop("Removed");
                    } else {
                        sop("Did not remove");
                    }
                    break;
                case 4:
                    sop("Search Name");
                    String nameEntry = input.next();
                    if (nameList.contains(nameEntry)) {
                        sop("Found:"+nameEntry);
                    }else{
                        sop("Not found");
                    }
                    break;
                default:
                    sop("Invalid");
            }
        }

        input.close();

    }
}
