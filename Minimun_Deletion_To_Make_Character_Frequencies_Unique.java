import java.util.HashSet;

public class Minimun_Deletion_To_Make_Character_Frequencies_Unique {
    public static void main(String[] args) {
        String str="aaabbbcc";
        System.out.println(minDeletions(str));
    }
    public static int minDeletions(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int ans=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0&&hs.contains(freq[i])){
                freq[i]--;
                ans++;
            }
            hs.add(freq[i]);
        }
        return ans;
    }
}
