public class Bitwise_Operater {
    public static void main(String[] args) {
        int n=32;
        evenOdd(n);
        int[] arr={2,2,33,33,7,7,1,1,0,99,99};
        System.out.println(uniqueElement(arr));
    }
    public static int uniqueElement(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            temp=temp^arr[i];
        }
        return temp;
    }
    public static void evenOdd(int n){
        if((n&1)==1){
            System.out.println("ODD");
        }else{
            System.out.println("EVEN");
        }
    }
}
