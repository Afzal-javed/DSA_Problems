import java.util.Arrays;
import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,2,9,1,6,3,5,4};
        System.out.println(Arrays.toString(stockSpan(arr)));
    }
    public static int[] stockSpan(int[] arr){
        int[] ans=new int[arr.length];
        ans[0]=1;
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size()>0&&arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=i+1;
            }else {
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
