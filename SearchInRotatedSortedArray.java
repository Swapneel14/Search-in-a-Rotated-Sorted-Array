import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        int arr[]={3,3,1,2,3,3,3,3,3,3};
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();
        System.err.println(solution(arr, k));
    }
    public static boolean solution(int arr[],int k){
        int n= arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[low]==arr[mid]&&arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=k&&k<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=k&&k<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
