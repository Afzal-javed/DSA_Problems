import java.util.ArrayList;
import java.util.List;

public class Solved_By_Match {
    public static void main(String[] args) {
        int n=9;
        List<Integer>ar=new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(20);
        ar.add(10);
        ar.add(10);
        ar.add(30);
        ar.add(50);
        ar.add(10);
        ar.add(20);
        System.out.println(sockMerchant(n,ar));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int ans=0;
        int[] freq=new int[100];
        for(int i=0;i<n;i++){
            freq[ar.get(i)]++;
        }
        for(int i=0;i< freq.length;i++){
            if(freq[i]>1){
                if(freq[i]%2==0){
                    ans=ans+freq[i]/2;
                }
                else{
                    ans=ans+(freq[i]-1)/2;
                }
            }
        }
        return ans;
    }


}
