/*
(a) Write the program to count occurrences of a given character using Regex in Java.
 */
package Problem9a;
import java.util.regex.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String to search in: ");
        String sentence = input.nextLine();

        System.out.println("Enter character to search for: ");
        String pattern = input.next();
        Matcher matcher = Pattern.compile(pattern).matcher(sentence);

        int count = 0;
        while(matcher.find()) {
            count++;
        }
        

        System.out.println("The character \'"+pattern+"\' occurred in the sentence \""+sentence+"\" "+count+" times");
        input.close();
    }
}
