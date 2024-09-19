package JavaBasics;

import java.util.Scanner;

//Swapping two numbers
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b:" + b);
    }
}
