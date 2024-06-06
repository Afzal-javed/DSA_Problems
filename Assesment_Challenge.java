import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assesment_Challenge {
    public static void main(String[] args) {
        String str="aabbccde";//token : p3tf0vj4a2
        // bc1d1e
        System.out.println(usinghashmap(str));
    }
    public static String usinghashmap(String str){
        String ans="";
        HashMap<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
      /*  for (Map.Entry<Character,Integer>entry:map.entrySet()) {
            if(entry.getValue()==map.get(str.charAt(i)))
        }*/
        return ans;
    }
    public static String strmediam(String str){
        int [] freq=new int[26];
        String ans="";
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        List<Character>lst=new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            lst.add(i);
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0){
                ans+=freq[i];
                char ch= lst.get(i);
                ans+=ch;
            }
        }
        String token="p3tf0vj4a2";
        int i=0;
        String finalAns="";
        while (i<ans.length()){
            boolean flag= true;
            for (int j = 0; j < token.length(); j++) {
                if(ans.charAt(i)==token.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                finalAns+=ans.charAt(i);
            }
            i++;
        }
        return finalAns;
    }
}
