
public class Reapeating_Element {
    public static int findrepeat(int arr[], int n) {
        int slow = arr[0] + 1;
        int fast = arr[0] + 1;

        do {
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        } while (slow != fast);
        
        slow = arr[0] + 1;
        while (slow != fast) {
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }

        return slow - 1;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 2, 1, 3, 2, 3, 2 };
        System.out.print(findrepeat(arr, arr.length));
    }
}
