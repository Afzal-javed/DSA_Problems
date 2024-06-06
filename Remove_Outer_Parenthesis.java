import java.util.Stack;

public class Remove_Outer_Parenthesis {
    public static void main(String[] args) {
        String str="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(str));
    }
    public static String removeOuterParentheses(String s) {
        String ans="";
        Stack<Character>st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch==')'){
                st.pop();
                if(st.size()>0){
                    ans+=ch;
                }
            }else{
                if(st.size()>0){
                    ans+=ch;
                }
                st.push(ch);
            }
        }
        return ans;
    }
}
