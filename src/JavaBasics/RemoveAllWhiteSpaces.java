package JavaBasics;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();

        String result = str.replaceAll("\\s+","");
        System.out.println(result);
    }
}
