package JavaBasics;

import java.util.Scanner;


//Reversing a number
public class Reverse_a_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), reversed = 0;
        while (num != 0){
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
