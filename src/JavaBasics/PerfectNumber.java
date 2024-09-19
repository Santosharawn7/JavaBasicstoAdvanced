package JavaBasics;

import java.util.Scanner;

//Perfect number is equal to the sum of its divisors i.e, the divisor of 6 are 1, 2, 3 where the sum of 1, 2, and 3 is 6
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i=1; i <= num/2; i++){
            if(num%i == 0){
                sum += i;
            }
        }
        System.out.println(num == sum);
    }
}
