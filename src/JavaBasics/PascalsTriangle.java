package JavaBasics;

import java.util.Scanner;

//Pascals triangle is where numbers forms a series in triangle downward, where the bottom number is sum of adjacent above two elements
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++){
            int num = 4;
            System.out.format("%"+ (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++){
                System.out.format("%4d", num);
                num = num * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
