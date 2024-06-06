public class Sum_Of_Subarray_Minimums {
    public static void main(String[] args) {
        int [] arr={3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
    public static int sumSubarrayMins(int[] arr) {
        if(arr.length==1) return arr[0];
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            int e=i;
            while(s<=e&&e<arr.length){
                ans=ans+min(arr,s,e);
                s=e;
                e=e+1;
            }
        }
        return ans;
    }
    public static int min(int [] arr,int s, int e){
        if(s==e) return arr[s];
        int min=Integer.MAX_VALUE;
        for(int i=s;i<e;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
