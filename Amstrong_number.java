public class Amstrong_number {
    public static void main(String[] args) {
        int n=8208;
        int armstrong=armstrongNumber(n);
        if(armstrong==n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
    public  static  int armstrongNumber(int n){
        int pow=pow(n);
        int ans=0;
        while(n>0){
            int rem=n%10;
            int power=power(rem,pow);
            ans=ans+power;
            n=n/10;
        }
        return ans;

    }
    public  static int power(int rem,int pow){
        int result=1;
        for (int i = 1; i <=pow ; i++) {
            result =result*rem;
        }
        return result;
    }
    public static int pow(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}
