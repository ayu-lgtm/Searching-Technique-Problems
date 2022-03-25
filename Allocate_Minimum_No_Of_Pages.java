public class Allocate_Minimum_No_Of_Pages {
    public static void Allocate(int arr[],int k){
        int sum=0,max=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        int low=max,high=sum,res=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isFeasible(arr,k,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        System.out.print(res);
    }
    public static boolean isFeasible(int arr[],int k,int ans){
        int req=1,sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>ans){
                req++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return (req<=k);
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40};
        int k=2;
        Allocate(arr,k);
    }
}
