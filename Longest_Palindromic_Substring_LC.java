public class Longest_Palindromic_Substring_LC {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String str) {
        int i=1,s=0;
        String ans="";
        while (i<=str.length()){
            boolean isPlind=isPalindrome(str.substring(s,i));
            if(isPlind==true){
                if(ans.length()<str.substring(s,i).length()){
                    ans=str.substring(s,i);
                }
            }
            if(i==str.length()){
                s++;
                i=s+1;
            }else{
                i++;
            }

        }
        return ans;
    }
    public static boolean isPalindrome(String str){
        if(str.length()==1) return  true;
        int i=0,j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return  true;
    }
}
