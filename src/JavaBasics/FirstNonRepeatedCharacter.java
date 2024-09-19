package JavaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scanner.nextLine();

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c: str.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if(entry.getValue() ==1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
