public class Count_1_in_SortedArray {
    public static int funct(int arr[], int n, int l, int h) {
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == 0)
                l = mid + 1;
            else {
                if (mid == 0 || arr[mid] != arr[mid - 1]) {
                    return (n - mid);
                }
            }
            h = mid - 1;
        }
        return 0;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 0, 0 };
        System.out.print(funct(arr, arr.length, 0, arr.length - 1));
    }
}
