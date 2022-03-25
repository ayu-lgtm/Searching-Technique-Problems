public class FloorValue_Of_Square_Root {
    public static int function(int v) {
        int low = 1, high = v, res = -1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int mid_sqr = mid * mid;
            if (mid_sqr == v) {
                return mid_sqr;
            } else if (mid_sqr > v) {
                high = mid - 1;
            } else {
                low = mid + 1;
                res = mid;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int value = 17;
        System.out.print(function(value));
    }
}
