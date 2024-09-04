package JavaBasics;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 11, 22, 33, 44, 1, 2, 3, 4, 2, 4, 3, 1};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num: set){
            uniqueArray[index++] = num;
        }
        Arrays.sort(uniqueArray);
        System.out.println(Arrays.toString(uniqueArray));
    }
}
