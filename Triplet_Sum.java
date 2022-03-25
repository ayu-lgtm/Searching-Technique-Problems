import java.util.Arrays;

public class Triplet_Sum {
    public static void function(int arr[], int n, int sum) {
        int low = 0, high = n - 1;
        boolean b = true;
        for (int i = 0; i < n - 1; i++) {
            while (low < high) {
                if (arr[low] + arr[high] + arr[i + 1] == sum) {
                    System.out.println(arr[low] + " + " + arr[high] + " + " + arr[i + 1] + " = " + sum);
                    arr[low] = 0;
                    arr[high] = 0;
                    arr[i + 1] = 0;
                    low = 0;
                    high = n - 1;
                    Arrays.sort(arr);
                    b = false;
                } else if (arr[low] + arr[high] + arr[i] > sum) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        if (b == true) {
            System.out.println("Not found");
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 8, 9, 20, 40 };
        int sum = 32;
        function(arr, arr.length, sum);
    }
}
