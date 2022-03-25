public class Index_of_Last_Occurance {
    public static int occurance(int arr[], int x, int l, int h) {
        if (l > h)
            return -1;
        int mid = l + (h - l) / 2;
        if (arr[mid] > x) {
            return occurance(arr, x, l, mid - 1);

        } else if (arr[mid] < x) {
            return occurance(arr, x, mid + 1, h);
        } else {
            if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                return occurance(arr, x, mid + 1, h);
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 4, 4, 5, 5, 6, 6, 7, 8 };
        int x = 5;
        System.out.print(occurance(arr, x, 0, arr.length - 1));
    }
}
