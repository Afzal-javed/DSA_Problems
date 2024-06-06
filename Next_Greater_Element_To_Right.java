import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element_To_Right {
    public static void main(String[] args) {
        int [] arr={2,5,9,3,1,12,6,8,7};
        System.out.println(Arrays.toString(nextGreaterElementToTheRight(arr)));
    }
    public static int[] nextGreaterElementToTheRight(int [] arr){
        int[] nums=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        st.push(arr[arr.length-1]);
        nums[arr.length-1]=-1;
        for (int i = arr.length-2; i >= 0; i--) {
            while (st.size()>0&&arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nums[i]=-1;
            }else {
                nums[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nums;
    }
}
