package JavaBasics;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println(str.length());
    }
}
