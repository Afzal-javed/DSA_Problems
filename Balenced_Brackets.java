import java.util.Stack;
public class Balenced_Brackets {
    public static void main(String[] args) {
        String str="([(a+b)+{(c+d)*(e/f)}])";
        System.out.println(balenceBrackets(str));
    }
    public  static boolean balenceBrackets(String str){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0) return false;
                else if(st.peek()!='(') return false;
                else {
                    st.pop();
                }
            } else if (ch=='}') {
                if(st.size()==0) return false;
                else if(st.peek()!='{') return false;
                else {
                    st.pop();
                }
            } else if (ch==']') {
                if(st.size()==0) return false;
                else if(st.peek()!='[') return false;
                else {
                    st.pop();
                }
            }
        }
        return st.size()==0 ? true : false;
    }
}
