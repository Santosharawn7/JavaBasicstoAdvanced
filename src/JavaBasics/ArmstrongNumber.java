package JavaBasics;
import java.util.Scanner;

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
