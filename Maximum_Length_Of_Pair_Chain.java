
import java.util.Arrays;


public class Maximum_Length_Of_Pair_Chain {
    public static void main(String[] args) {
        int [][] pairs={{3,4},{2,3},{1,2}};
        System.out.println(findLongestChain(pairs));
    }
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b)-> a[1]-b[1]);
        int len=0, prev=-1001;
        for(int[] pair: pairs) {
            if(prev<pair[0]) {
                len++;
                prev=pair[1];
            }
        }
        return len;
    }
}
