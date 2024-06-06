import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K_th_Smallest_Prime_Fraction {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int k=3;
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr,k)));
    }
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<List<Integer>>lst=new ArrayList<>();
        int [] ans=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                List<Double> temp = new ArrayList<>();
                temp.add((double)arr[i]);
                temp.add((double)arr[j]);
                double fraction=(double) arr[i]/arr[j];
                System.out.println(fraction);
                temp.add(fraction);

            }
        }
        System.out.println(lst);
        System.out.println(lst.get(k));
        return ans;
    }
}
