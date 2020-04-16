/*
Write a program to Check if characters of a given string can be rearranged to form a
palindrome.
 */
package Problem10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean canBePalindrome = true;
        System.out.println("Enter string to be checked: ");
        String string = input.next();
        string = string.toLowerCase();
        char[] splitString = string.toCharArray();
        int size = string.length();

        int[] frequency = new int[26];
        for(char ch:splitString) {
            frequency[ch- 97] += 1;
        }
        int oddCount = 0;
        for(int i:frequency) {
            if(i%2 != 0) {
                oddCount++;
                if(i>=1 && size%2==0) {
                    canBePalindrome = false;
                }
            }
        }
        if(oddCount > 1 && oddCount%2 != 0) {
            canBePalindrome = false;
        }

        if(canBePalindrome) {
            System.out.println("The string \""+string+"\" can be a palindrome");
        }
        else {
            System.out.println("The string \""+string+"\" cannot be a palindrome");
        }
    }
}
