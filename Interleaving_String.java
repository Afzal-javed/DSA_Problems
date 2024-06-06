public class Interleaving_String {
    public static void main(String[] args) {
        String s1="";
        String s2="";
        String s3="a";
        System.out.println(isInterleave(s1,s2,s3));
    }
    public static boolean isInterleave(String s1,String s2,String s3){
        if(s1.length()==0&&s2.length()==0&&s3.length()==0) return true;
        int i=0,j=0,k=0,c=0;
        String str="";
        while (i<s3.length()&&c<s3.length()){
            while (j<s1.length()){
                if(s3.charAt(i)==s1.charAt(j)){
                    str+=s1.charAt(j);
                    i++;
                    j++;
                }else{
                    c++;
                    break;
                }
            }
            while (k<s2.length()){
                if(s3.charAt(i)==s2.charAt(k)){
                    str+=s2.charAt(k);
                    i++;
                    k++;
                }else {
                    c++;
                    break;
                }
            }
           c++;
        }
        return str.equals(s3);
    }
}
