import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_LC {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(arr,target)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int [] ans =new int[2];
        int firstIndex=binarySearchfirst(nums,target);
        int lastIndex=binarySearchlast(nums,target);
        ans[0]=firstIndex;
        ans[1]=lastIndex;
        return ans;
    }
    public static int binarySearchfirst(int[] arr,int target){
        int s=0,e=arr.length-1;
        int idx=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                idx=mid;
                e=mid-1;
            }else if(arr[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return idx;
    }
    public static int binarySearchlast(int[] arr,int target){
        int s=0,e=arr.length-1;
        int idx=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                idx=mid;
                s=mid+1;
            }else if(arr[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return idx;
    }
}
