import java.math.BigInteger;

public class Extra_Long_Factorial {
    public static void main(String[] args) {
        int n=25;
        extraLongFactorials(n);
    }
    public static void extraLongFactorials(int n) {
        // Write your code here
       BigInteger ans=BigInteger.valueOf(1);

        for (int i = 1; i <=n ; i++) {
            ans=ans.multiply(BigInteger.valueOf(i));
        }
        System.out.println(ans);
    }
}
