public class Greatest_Common_Divisor_of_Strings_LC {
    public static void main(String[] args) {
        String str1="ABCABC",str2="ABC";
        System.out.println(gcdofString(str1,str2));
    }
    public static String gcdofString(String str1,String str2){
        int i=0,j=0;
        int len=str1.length() > str2.length() ? str1.length() : str2.length();
        String temp="";
        while(i<str1.length()||j<str2.length()){
            if(i<str1.length()&&j<str2.length()&&str1.charAt(i)==str2.charAt(j)){
                temp+=str1.charAt(i);
                i++;
                j++;
            }
        }
        return temp;
    }
}
