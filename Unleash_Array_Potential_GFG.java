public class Unleash_Array_Potential_GFG {
    public static void main(String[] args) {
        int[] arr = {6,7,3,2};
        int n=4;
        System.out.println(maxValue(n,arr));
    }
    public static long maxValue(int n, int arr[]){
        // Code Here.
        int max=0;
        int secMax=0;
        int min=Integer.MAX_VALUE;
        int i=0,j=0,k= arr.length-1;
        while (i<arr.length-2){
            if(max<arr[i]){
                max=arr[i];
                j=i+1;
            }
            i++;
        }
        while (k>j+1){
            if(secMax<arr[k]){
                secMax=arr[k];
            }
            k--;
        }
        while (j<=k){
            if(min>arr[j]){
                min=arr[j];
            }
            j++;
        }

        long ans=(max-min)*secMax;
        return ans<0 ? 0:ans;

    }
}
