package JavaBasics;

import java.util.Scanner;


//Find the count of vowels and consonants in a string
public class VowelsConsonantsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");

        String str = scanner.nextLine();
        int vowels = 0, consonants =0;
        for(char c:str.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                vowels++;
            } else if (Character.isLetter(c)){
                consonants++;
            }
        }
        System.out.println("Vowels:"+vowels+" & Consonants:"+consonants);
    }
}
