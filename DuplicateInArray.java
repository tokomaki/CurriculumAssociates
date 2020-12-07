import java.util.ArrayList;
import java.util.List;

public class DuplicateInArray {

    public static List<Integer> duplicate(int[] arr) {
        // Create a dynamic array to store the numbers that occur more than once
        List<Integer> seen = new ArrayList<>();
        // Gather the max number from the array to determine the size of the boolean array
        int max = -1;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        boolean[] hasDuplicate = new boolean[max + 1];
        // If the number has been marked as seen, add it to the dynamic array, otherwise mark it
        // as seen in the boolean array
        for (int num : arr) {
            if (hasDuplicate[num]) {
                seen.add(num);
            }
            else {
                hasDuplicate[num] = true;
            }
        }
        return seen;
    }

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 2, 3, 2, 4, 5, 6, 9, 8, 9, 8, 11, 100, 74, 100};
        System.out.println(duplicate(arr).toString());
    }
}
