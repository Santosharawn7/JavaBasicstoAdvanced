package JavaBasics;

import java.util.Scanner;

//Checking Prime Number without using Library
public class PrimeNumberCheck {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = scanner.nextInt();
        boolean isPrime = true;

        for(int i=2; i<= Math.sqrt(num); i++){
            if(num % i ==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
