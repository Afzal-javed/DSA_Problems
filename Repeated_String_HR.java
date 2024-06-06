public class Repeated_String_HR {
    public static void main(String[] args) {
        String str="aab";
        long n=882787;
        System.out.println(repeatedString(str,n));
    }
    public static long repeatedString(String s, long n) {
        // Write your code here
        if(s.length()==1 && s.charAt(0)=='a') return n;
        String temp=s;
        long ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                ans++;
            }
        }
        long mod=n%s.length();
        ans=n/s.length()*ans;
        for (int i = 0; i < mod; i++) {
            if(s.charAt(i)=='a'){
                ans++;
            }
        }
        return ans;
    }
}
