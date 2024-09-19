package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;


//Checking if the String are Anagram to each other, i.e, alps is anagram of pals
public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter Second String: ");
        String str2 = scanner.nextLine();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));
    }
}
