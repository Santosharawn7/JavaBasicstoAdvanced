package JavaBasics;

//Finding the "n" factorial where n= 10
public class Factorial {
    public static void main(String[] args) {
        int num =10, factorial =1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
