import java.util.HashMap;

public class Sort_by_freq {
    public static void main(String[] args) {
        String str="bbaaaaccccffraaabxyz";
        System.out.println(sortByfreq(str));
    }
    public  static char[] sortByfreq(String str){
        char[] alpha=new char[26];
        HashMap<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
           if(map.containsKey(str.charAt(i))){
               map.put(str.charAt(i),map.getOrDefault(str.charAt(i),1));
           }else{
               map.put(str.charAt(i),1);
           }
        }
        System.out.println(map.keySet());
        return alpha;
    }

}
