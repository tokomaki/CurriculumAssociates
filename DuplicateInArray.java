import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateInArray {

    public static List<Integer> duplicate(int[] arr) {
        // Create a dynamic array to store the numbers that occur more than once
        List<Integer> seen = new ArrayList<>();
        // Gather the max number from the array to determine the size of the boolean array
        int max = Integer.MIN_VALUE;
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input the size:");
        int size = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] q = new int[size];

        System.out.println("Please input the numbers for the array separated by spaces:");
        String[] qItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < size; i++) {
            int qItem = Integer.parseInt(qItems[i].replaceAll("-", ""));
            q[i] = qItem;
        }

        System.out.println(Arrays.toString(q));
        System.out.println(duplicate(q));

        scanner.close();
    }
}
