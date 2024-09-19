package JavaBasics;

import java.util.Scanner;

public class EmptyStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = scanner.nextLine();
        if (str.isEmpty() == true){
            System.out.println("String is Empty");
        } else {
            System.out.println("String is not Empty");
        }

    }
}
