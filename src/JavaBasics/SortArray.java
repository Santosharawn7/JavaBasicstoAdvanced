package JavaBasics;

import java.util.Scanner;

//Sort the Array without using the library
public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter teh number of elements in the array: ");
//        int size = scanner.nextInt();
//        int[] arr = new int[size];
        int[] arr = {1,4, 5, 3, 2, 17, 8};

//        System.out.println("Enter the elemts of the array");
//        for(int i = 0; i< arr.length(); i++){
//            arr[i] = scanner.nextInt();
//        }

        //By doing Bubble Sort
        for(int i = 0; i< arr.length-1; i++){
            for(int j =0; j< arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i] + "");
        }
    }
}
