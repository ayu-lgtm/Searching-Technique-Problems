class Index_Of_First_Occurance {

    // recursive solution
    public static int occurance(int arr[], int x, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] > x) {
                return occurance(arr, x, l, mid - 1);
            } else if (arr[mid] < x) {
                return occurance(arr, x, mid + 1, h);
            }

            // first occurance method
            else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    return occurance(arr, x, l, mid - 1);
                }
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 10, 20, 20, 30, 40, 50, 60, 70, 80, 80 };
        int x = 20;
        System.out.print(occurance(arr, x, 0, arr.length - 1));
    }
}