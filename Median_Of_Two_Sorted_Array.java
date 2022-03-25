public class Median_Of_Two_Sorted_Array {
    public static double function(int a[], int b[], int l, int m) {
        int s1 = 0, e1 = l - 1;
        while (s1 <= e1) {
            int i1 = (s1 + e1) / 2;
            int i2 = (l + m + 1) / 2 - i1;
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a[i1 - 1];
            int min1 = (i1 == l) ? Integer.MAX_VALUE : a[i1];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : b[i2 - 1];
            int min2 = (i2 == l) ? Integer.MAX_VALUE : b[i2];

            if (max2 <= min1 && max1 <= min2) {
                if ((l + m) % 2 == 0) {
                    return (double) (Math.max(max1, max2) + Math.min(min1, min2)) / 2;
                } else {
                    return (double) Math.max(max1, max2);
                }
            }
            if (max1 > min2) {
                e1 = i1 - 1;
            } else {
                s1 = i1 + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr1[] = { 10, 20, 30 };
        int arr2[] = { 5, 15, 25, 35, 45 };
        System.out.print(function(arr1, arr2, arr1.length, arr2.length));
    }
}
