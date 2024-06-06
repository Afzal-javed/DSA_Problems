public class maxLargest {
    public static void main(String[] args) {
        int a=3,b=4,c=1;
       maxLargest(a,b,c);
    }
    public static void maxLargest(int a,int b,int c){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MAX_VALUE;
        if(a>b && a>c){
            max=a;
            if(b>c){
                secMax=b;
            }else{
                secMax=c;
            }
        }else if(b>a&&b>c){
            max=b;
            if(a>c){
                secMax=a;
            }else{
                secMax=c;
            }
        }else{
            max=c;
            if(a>b){
                secMax=a;
            }else{
                secMax=b;
            }
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
