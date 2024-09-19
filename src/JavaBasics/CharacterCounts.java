package JavaBasics;

import java.util.Scanner;

public class CharacterCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scanner.nextLine();
        System.out.println("Enter the character to count:");
        char ch = scanner.next().charAt(0);
        int count = 0;

        for (char c: str.toCharArray()){
            if (c == ch) count++;
        }
        System.out.println(count);
    }
}
