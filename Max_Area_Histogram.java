import java.util.Stack;

public class Max_Area_Histogram {
    public static void main(String[] args) {
        long [] arr={9,10,4,10,4,5,16};
        System.out.println(getMaxArea(arr));
    }
    public static long getMaxArea(long[] arr){
        long []rb=new long[arr.length];
        rightBound(arr,rb);
        long[]lb=new long[arr.length];
        leftBound(arr,lb);
        long maxArea=0;
        for (int i = 0; i < arr.length; i++) {
            long width=rb[i]-lb[i]-1;
            long area=arr[i]*width;
            if(area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;
    }
    public static void rightBound(long []arr,long[] rb){
        rb[arr.length-1]= arr.length;
        Stack<Integer>st=new Stack<>();
        st.push(arr.length-1);
        for (int i = arr.length-2; i >=0 ; i--) {
            while (st.size()>0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]= arr.length;
            }else{
                rb[i]=st.peek();
            }
            st.push(i);
        }
    }
    public static void leftBound(long []arr,long[] lb){
        lb[0]=-1;
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length ; i++) {
            while (st.size()>0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                lb[i]=-1;
            }else{
                lb[i]=st.peek();
            }
            st.push(i);
        }
    }
}
