package JavaBasics;

import java.util.Scanner;

//Counting the digits of the number
public class DigitCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        int count = String.valueOf(num).length();
        System.out.println(count);
    }
}
