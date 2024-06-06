public class Binary_search_using_recursion {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int s=0,e= arr.length-1,k=9;
        int ans=binarySearch(arr,s,e,k);
        int ans1=linearSearch(arr,0,10);
        System.out.println(ans1);
    }
    public static int binarySearch(int[] arr,int s,int e,int k){
        int mid=s+(e-s)/2;
        if(arr[mid]==k) return mid;
        else if (arr[mid]>k) {
            return binarySearch(arr,s,mid-1,k);
        } else if (arr[mid]<k) {
            return binarySearch(arr,mid+1,e,k);
        }else{
            return -1;
        }
    }
    public static int linearSearch(int [] arr,int index,int k){
        if(index== arr.length) return -1;
        else if (arr[index]==k) return index;
        else return linearSearch(arr,index+1,k);
    }
}
