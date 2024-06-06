import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Find_All_Duplicate_In_Array {
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer>lst=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        if(nums.length==1) return lst;
        for(int i=0;i<nums.length;i++){
            if(!lst.contains(nums[i])){
                lst.add(nums[i]);
            }else{
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
