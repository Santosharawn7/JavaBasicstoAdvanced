package JavaBasics;

import java.util.Scanner;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for(int num = start; num <= end; num++){
            boolean isPrime = true;
            for (int i=2; i <= Math.sqrt(num); i++){
                if(num % i ==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && num > 1) {
                System.out.println(num + "");
            }
        }
    }
}
