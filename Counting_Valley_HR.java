import java.util.Stack;

public class Counting_Valley_HR {
    public static void main(String[] args) {
        String str="DUDDDUUDUU";
        int steps=10;
        System.out.println(countingValley(str,steps));
    }
    public static int countingValley(String str,int steps){
        Stack<Character> st=new Stack<>();
        int ans=0;
        for(int i=0;i<str.length();i++){
            if(st.empty()){
                if(str.charAt(i)=='D'){
                    ans++;
                }
                st.push(str.charAt(i));
            }else if(st.peek()!=str.charAt(i)){
                st.pop();

            }else{
                st.push(str.charAt(i));
            }
        }
        return ans;
    }
}
