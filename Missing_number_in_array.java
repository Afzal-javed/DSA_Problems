import java.util.Arrays;

public class Missing_number_in_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int n=5;
        System.out.println(missingNumber(arr,n));
    }
   public static int missingNumber(int array[], int n) {
        // Your Code Here
       int c=1;
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            if(c==n||c!=array[i]) {
                return c;
            }
            c++;
        }
        return 0;
    }
}
