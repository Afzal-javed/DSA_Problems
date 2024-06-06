import java.util.Arrays;

public class Next_Greater_Element_I_LC {
    public static void main(String[] args) {
        int [] nums1={4,1,2};
        int [] nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans=new int[nums1.length];
        for(int i=nums1.length-1;i>=0;i--){
            int j=0;
            int idx=-1;
            for(j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx=j+1;
                    break;
                }
            }
                while(idx<nums2.length){
                    if(nums1[i]<nums2[idx]){
                        ans[i]=nums2[idx];
                        break;
                    }
                    idx++;
                }
                if(idx== nums2.length){
                    ans[i]=-1;
                }

        }
        return ans;
    }
}
