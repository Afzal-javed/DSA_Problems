import java.util.ArrayList;
import java.util.List;

public class Subarray_hackerRank {
    public static void main(String[] args) {
        int d=4;
        int m=2;
        //1 2 1 3 2
        List<Integer>s=new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);


        System.out.println(birthday(s,d,m));
    }
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int ans=0;
        for(int i=0;i<s.size();i++){
            int temp=0;
            int c=0;
            int j=i;
            while(c<m&&j<s.size()) {
                temp+=s.get(j);
                j++;
                c++;
            }
            if(temp==d){
                ans++;
            }
        }
        return ans;
    }

}

