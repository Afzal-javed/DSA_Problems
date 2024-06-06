import java.util.ArrayList;
import java.util.List;

public class Common_Substring_Count {
    public static void main(String[] args) {
        String str1="abcdxyz";
        String str2="xyzabcd";
        System.out.println(totalSubstring(str1,str2));
    }
    public static int totalSubstring(String str1,String str2){
        List<String>lst=new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            for(int j=i;j<str1.length();j++){
                lst.add(str1.substring(i,j));
            }
        }
        int ans=0;
        for (int i = 0; i < str2.length(); i++) {
            for(int j=i;j<str2.length();j++){
                if(lst.contains(str2.substring(i,j))){
                    ans++;
                }
            }
        }
        return ans;
    }
}
