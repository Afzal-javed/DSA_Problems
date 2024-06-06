public class series {
    public static void main(String[] args) {
        int n=8;
        //2 6 10 14 22 26 30 34 42 46 50 54 62...n
        int ans=2;
        for (int i = 1; i <=n; i++) {
            System.out.print(ans + " ");
            if(i%4==0){
                ans=ans+8;
            }else{
                ans=ans+4;
            }
        }
    }

}
