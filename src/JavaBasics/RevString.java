package JavaBasics;

public class RevString {
    public static void main(String[] args) {
        String str = "Automation";
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);
    }
}
