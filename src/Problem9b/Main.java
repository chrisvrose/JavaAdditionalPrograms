/*
(b) Write a program to check if a string contains only alphabets in Java using Regex.
 */
package Problem9b;
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line");
        String sentence = input.next();

        String regex = "[a-zA-Z]+";

        Matcher matcher = Pattern.compile(regex).matcher(sentence);

        if(matcher.matches()) {
            System.out.println("Only alphabets in the input sentence!");
        }
        else {
            System.out.println("There is a character besides alphabets in the sentence!");
        }
    }
}
