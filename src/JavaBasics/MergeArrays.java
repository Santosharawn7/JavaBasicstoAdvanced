package JavaBasics;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2, 4, 6};
        int[] mergedarr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedarr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedarr, arr1.length, arr2.length);
        System.out.println(Arrays.toString((mergedarr)));
    }
}
