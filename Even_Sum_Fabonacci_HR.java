public class Even_Sum_Fabonacci_HR {
    public static void main(String[] args) {
        long n=100;
        System.out.println(evenSumFabonacci(n));
    }
    public static long evenSumFabonacci(long n){
        int a=0,b=1,sum=0,ans=0;
        while (sum<n){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
            if(sum%2==0){
                ans+=sum;
            }
        }
        return ans;
    }
}
