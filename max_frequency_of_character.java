import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class max_frequency_of_character {
    public static void main(String[] args) {
        String str="aabbbcccccddddddcaaaa";
        System.out.println(maxFreq(str));
        System.out.println(maximumAllFrequency(str));
    }
    public static int maxFreq(String str){
        int ans=0,freq=0;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==str.charAt(i-1)){
                freq++;
                if(ans<freq){
                    ans=freq;
                }
            }else{
                freq=0;
            }
        }
        return ans+1;
    }
    public static List<Character> maximumAllFrequency(String str){
        int[] freq=new int[26];
        List<Character>ans=new ArrayList<>();
        int max=0;
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>max){
                max=freq[i];
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==max){
                int temp=(char) i + 97;
                char alpha=(char) temp;
                ans.add(alpha);
            }
        }

        return ans;
    }
}
