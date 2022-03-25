public class Minimum_number_in_Sorted_Rotated_Array {
    public static int function(int arr[],int n){
        int low=0;
        int high=n-1;
        while(low<high){
            if(arr[low]>arr[high]){
                low++;
            }
            else if(arr[low]<arr[high]){
                high--;
            }
            else if(low==high){
                break;
            }
            
        }
        return arr[low];
    }
    public static void main(String args[]){
        int arr[]={200,300,400,10,20,30};
        System.out.print(function(arr,arr.length));
    }
}
