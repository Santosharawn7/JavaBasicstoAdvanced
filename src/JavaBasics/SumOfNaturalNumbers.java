package JavaBasics;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        int sum = n*(n+1)/2;

        System.out.println(sum);

    }
}
