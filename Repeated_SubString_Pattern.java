public class Repeated_SubString_Pattern {
    public static void main(String[] args) {
        String s="abac";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {
        char checker=s.charAt(0);
        String str=""+checker;
        for(int i=1;i<s.length();i++){
            if(checker==s.charAt(i)){
                break;
            }else{
                str+=s.charAt(i);
            }
        }
        System.out.println(str);
        int i=0;
        int len=s.length();
        while(i<s.length()){
            if(s.length()%str.length()!=0){
                return false;
            }
            int j=0;
            while(j<str.length()){
                if(str.charAt(j)==s.charAt(j+i)){
                    len--;
                }else{
                    return false;
                }
                j++;
            }
            i=i+j;
        }
        if(len!=0) return false;
        return true;
    }
}
