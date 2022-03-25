
public class CeilValue_OF_SquareRoot {
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
                res = mid;
                low = mid + 1;
            }

        }
        return res + 1;
    }

    public static void main(String args[]) {
        int value = 12;
        System.out.print(function(value));
    }
}
