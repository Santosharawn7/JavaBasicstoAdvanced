package JavaBasics;

import java.util.Scanner;

//Check if the string is Palindrome i.e. a palindrome string: civic, radar, level
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();  // Read user input

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        scanner.close();  // Close the scanner
    }
}
