public class Number_Of_Occurrence {
    public static void main(String[] args) {
        int[] arr={10,11};
        int x=10;
        System.out.println(count(arr,x));
    }
    public static int count(int[] arr,int x) {
        // code here
        int first=index(arr,x,true);
        int last=index(arr,x,false);
        System.out.println(first+"  "+last);
        if(first==-1&&last==-1) return 0;
        return Math.abs(last-first)+1;

    }
    public static int index(int[]arr,int t,boolean firstIndex){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==t){
                ans= mid;
                if(firstIndex){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            else if(arr[mid]<t){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
}
