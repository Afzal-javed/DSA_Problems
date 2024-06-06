import java.util.ArrayList;
import java.util.List;

public class pangram_string {
    public static void main(String[] args) {
        String str="qklccnqeicrabxpggieplwjhakurwwhxbugbryvhazoofifidzvxczmpdjfcyiuhqyedxhzexvpitxknjogpetvgxeqrjuuxzzfblhmhbgibocbhtcbgyxzchlawvnhczlecsrioapggorouzcputqsxhvoxbqxxydiumxwg";
            System.out.println(checkIfPangram(str));
        }

    public static boolean checkIfPangram(String str) {
        List<Character> lst=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            lst.add(str.charAt(i));
        }
        if(lst.size()<26) return false;
        for (char i = 'a'; i <='z'; i++) {
            if (!lst.contains(i)) {
                return false;
            }
        }
        return true;
    }
}
