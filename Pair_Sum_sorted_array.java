import java.util.Arrays;

public class Pair_Sum_sorted_array {
    public static void function(int arr[], int sum) {
        int l = 0, h = arr.length - 1;
        boolean b = false;
        while (l < h) {
            if (arr[l] + arr[h] == sum) {
                System.out.println(arr[l] + " + " + arr[h] + " = " + sum);
                arr[h] = 0;
                arr[l] = 0;
                l = 0;
                h = arr.length - 1;
                Arrays.sort(arr);
                b = true;
            } else if (arr[l] + arr[h] > sum) {
                h--;
            } else {
                l++;
            }
        }
        if (b == false) {
            System.out.println("Not Found");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 11, 12, 15, 17, 20 };
        int sum = 20;
        function(arr, sum);
    }
}
