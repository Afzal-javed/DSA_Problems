public class Candy_LC {
    public static void main(String[] args) {
        int[]r={60,80,100,100,100,100,20};
        System.out.println(candy(r));
    }
    public static int candy(int[] r) {
        int[] arr=new int[r.length];
        for(int i=0;i<r.length;i++){
            arr[i]=1;
        }
        for(int i=1;i<r.length;i++){
            if(r[i]>r[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }
        for(int i=r.length-2;i>=0;i--){
            if(r[i]>r[i+1]){
                arr[i]=Math.max(arr[i],arr[i+1]+1);
            }
        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
}
