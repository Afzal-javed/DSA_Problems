public class Drawing_book_HR {
    public static void main(String[] args) {
        int n=7;
        int p=3;
        System.out.println(pageCount(n,p));
    }

    public static int pageCount(int n, int p) {
        if(p==1) return 0;
        int minPage=Math.min(n-p,p);
        int ans=0;
        if(minPage==p){
            int i=1;
            while(i<minPage){
                ans++;
                i=i+2;
            }
            return ans;
        }else{
            int i=0;
            if(n%2!=0){
                i=n-1;
            }else {
                i = n;
            }
            while(i>p){
                ans++;
                i=i-2;
            }
            return ans;
        }

    }
}
