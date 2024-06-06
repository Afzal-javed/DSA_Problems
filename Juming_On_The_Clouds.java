import java.util.ArrayList;
import java.util.List;

public class Juming_On_The_Clouds {
    public static void main(String[] args) {
        List<Integer>lst=new ArrayList<>();
        lst.add(0);
        lst.add(0);
        lst.add(0);
        lst.add(1);
        lst.add(0);
        lst.add(0);
        System.out.println(jumpingOnClouds((lst)));
    }
    public static int jumpingOnClouds(List<Integer> c) {
        int i=0,ans=0,p=0;
        while(i<=c.size()-2){        // 0 0 0 1 0 0
            if(i<c.size()-2&&c.get(i+2)==0){
                i+=2;
                ans++;
            }else if(c.get(i+1)==0){
                i++;
                ans++;
            }else{
                i++;
            }
        }
        return ans;
    }
}
