import java.util.ArrayList;
import java.util.List;

public class max_sum_of_contigeous_subarray_interview_ques_instaAstro {
//    public  static int max_sum_subarray(int[] arr){
//        int ans=0;
//        List<Integer>lst=new ArrayList<>();
//        for (int i = 0; i < arr.length-1; i++) {
//            int temp=arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                temp+=arr[j];
//                lst.add(temp);
//            }
//        }
//        for (int i: lst) {
//            if(ans<i){
//                ans=i;
//            }
//
//        }
//        return ans;
//    }
    public static void main(String[] args) {
    int [] arr={2,-3,4,0,-1,2,-5,3};
        System.out.println(max_sum_subarray_optimize(arr));
    }
    public  static int max_sum_subarray_optimize(int [] arr){
        int curr_sum=0;
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr_sum+=arr[i];
            ans=Math.max(ans,curr_sum);
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return ans;
    }

}
