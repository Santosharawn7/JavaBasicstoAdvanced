package JavaBasics;

//Finding the largest and smallest number in an array
public class NumSizeElementArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int largest = arr[0];
        int smallest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("The largest number in array: " + largest);
        System.out.println("The smallest number in array: " + smallest);
    }
}
