package JavaBasics;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println(factorial(num));
    }
        static int factorial(int n) {
            if (n ==0) return 1;
            return n * factorial(n-1);

    }
}
