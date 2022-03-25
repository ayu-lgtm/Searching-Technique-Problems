public class Count_Occurance_sorted_Array {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 3, 4, 4, 4, 5, 6, 7, 7, 7, 8 };
        int x = 3;

        System.out.print(CountNumber(arr, arr.length, x));
    }

    public static int CountNumber(int arr[], int n, int x) {
        int firstOccur = FirstOcc(arr, x, 0, arr.length - 1);
        if (firstOccur == -1) {
            return 0;
        }
        return (LastOccur(arr, x, 0, arr.length) - firstOccur) + 1;

    }

    public static int FirstOcc(int arr[], int x, int l, int h) {
        if (l > h)
            return -1;
        int mid = l + (h - l) / 2;
        if (arr[mid] > x) {
            return FirstOcc(arr, x, l, mid - 1);
        } else if (arr[mid] < x) {
            return FirstOcc(arr, x, mid + 1, h);
        } else {
            if (mid == 0 || arr[mid] != arr[mid - 1]) {
                return mid;
            } else {
                return FirstOcc(arr, x, l, mid - 1);
            }
        }
    }

    public static int LastOccur(int arr[], int x, int l, int h) {
        if (l > h)
            return -1;
        int mid = l + (h - l) / 2;
        if (arr[mid] > x) {
            return LastOccur(arr, x, l, mid - 1);
        } else if (arr[mid] < x) {
            return LastOccur(arr, x, mid + 1, h);
        } else {
            if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                return LastOccur(arr, x, mid + 1, h);
            }
        }
    }
}
