public class beautiful_days_of_movies_hr {
    public static void main(String[] args) {
        int i=20;
        int j=23;
        int k=6;

       System.out.println(beautifulDays(i,j,k));
    }
    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int ans=0;
        while(i<=j){
            int rev=reverse(i);
            int diference=Math.abs(i-rev);
            if(diference%k==0){
                ans++;
            }
            i++;
        }
        return ans;
    }
    public static int reverse(int i){
        int rev=0;
        while(i>0){
            int rem=i%10;
            rev=rev*10+rem;
            i=i/10;
        }
        return rev;
    }
}
