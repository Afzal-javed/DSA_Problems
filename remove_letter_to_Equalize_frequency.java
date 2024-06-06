import java.util.HashMap;

public class remove_letter_to_Equalize_frequency {
    public static void main(String[] args) {
        String word="bbac";
        System.out.println(equalFrequency(word));
    }
    public static boolean equalFrequency(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }else{
                map.put(word.charAt(i),1);
            }
        }
        int c=0;
        for(int i=0;i<map.size();i++){
            System.out.println(word.charAt(i)+" "+map.get(word.charAt(i)));
            if(map.get(word.charAt(i))>2){
                return false;
            }
            if(map.get(word.charAt(i))==2){
                c++;
                if(c>1) return false;
            }
        }


        return true;
    }
}
