public class Search_In_Sorted_Rotated_Array {
    public static int function(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > arr[low]) {
                if (arr[mid] > x && x >= arr[low]) {
                    high = mid - 1;

                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] < x && x <= arr[low]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 100, 200, 400, 1000, 10, 20, 30, 45 };
        // 0 1 2 3 4 5 6 7
        int x = 30;
        System.out.print(function(arr, x));
    }
}
