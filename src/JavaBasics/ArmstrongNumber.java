package JavaBasics;
import java.util.Scanner;


//Checking Armstrong Number, an armstrong number is the number where the sum of the power of last digit of the numbers in the number is equal i.e, in 153 = 1^3 + 5^3 + 3^3 , since 3 is the last digit of 153, the sum of the cube of all three digits
//must be equal to the number
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), sum=0, temp=num;
        while(temp !=0 ){
            int digit = temp % 10;
            sum += (int) Math.pow(digit, 3);
            temp /= 10;
        }
        System.out.println(num == sum);
    }
}
