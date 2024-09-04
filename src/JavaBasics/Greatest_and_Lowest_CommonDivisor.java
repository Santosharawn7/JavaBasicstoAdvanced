package JavaBasics;

public class Greatest_and_Lowest_CommonDivisor {

    public static int calculateHCF(int a, int b){
        while (b != 0){
            int temp =b;
            b = a % b;
            a = temp;
        }
        return  a;
    }

    public static int calculateLCM(int a, int b) {
        return (a*b) /calculateHCF(a,b);
    }

    public static void main(String[] args) {
        int a = 60, b = 48;

        int hcf = calculateHCF(a, b);
        int lcm = calculateLCM(a, b);

        System.out.println("HCF:" + hcf);
        System.out.println("LCM:" + lcm );
    }
}
