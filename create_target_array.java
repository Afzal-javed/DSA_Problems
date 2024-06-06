import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class create_target_array {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] idx={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,idx)));
        //System.out.println(createTargetArray(nums,idx));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int [] ans=new int[nums.length];
        int idx=0;
        List<Integer>lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            lst.add(index[i],nums[i]);
        }
        for (int i : lst) {
            ans[idx]=i;
            idx++;
        }

        return ans;
    }
}
