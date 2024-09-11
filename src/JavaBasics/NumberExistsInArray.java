package JavaBasics;

//Check if the number exists in an array, we use binary search there.
public class NumberExistsInArray {

    public static boolean exists(int[] ints, int k) {

        //Using Binary Search Method
        int left = 0;
        int right = ints.length - 1;

        while (left <= right) {
            int mid = left + (right -left) / 2;

            if(ints[mid] == k){
                return true;
            } else if (ints[mid] < k) {
                left = mid +1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] ints = {-9, 14, 37, 102};
        System.out.println(NumberExistsInArray.exists(ints, 102));  // Should return true
        System.out.println(NumberExistsInArray.exists(ints, 36));
    }
}
