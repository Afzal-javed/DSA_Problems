import java.util.ArrayList;
import java.util.List;

public class Divisible_Sum_Pair {
    public static void main(String[] args) {
        int k=3;
        List<Integer>ar=new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
        System.out.println(divisibleSumPairs(k,ar));
    }
    public static int divisibleSumPairs(int k, List<Integer> ar) {
        // Write your code here
        int ans=0;
        //1 3 2 6 1 2
        for(int i=0;i<ar.size();i++){
            for(int j=i;j<ar.size();j++){
                if(i<j){
                    if((ar.get(i)+ar.get(j))%k==0){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
