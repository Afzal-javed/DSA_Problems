import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class word_pattern {
    public static void main(String[] args) {
        String p="abba";
        String s="dog dog dog dog";
        System.out.println(wordPattern(p,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] str=s.split(" ");
        List<String> lst=new ArrayList<>();
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                System.out.println("key : "+map.get(pattern.charAt(i))+"     Value :"+str[i]);
                if(!map.get(pattern.charAt(i)).equals(str[i])){
                    return false;
                }
            }else{
                if(lst.contains(str[i])){
                    return false;
                }
                lst.add(str[i]);
                map.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }
}
