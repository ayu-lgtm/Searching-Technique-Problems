public class peakPoint {
    public static void peakArray(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == 0 || arr[mid] >= arr[mid + 1])) {
                System.out.print(arr[mid] + " ");
                return;
            }
            if (mid > 0 && arr[mid] > arr[mid - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 15, 5, 23, 90, 67 };
        peakArray(arr, arr.length);
    }
}
