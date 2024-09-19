package JavaBasics;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 !=0 || year % 400 ==0);
        if(isLeap){
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
