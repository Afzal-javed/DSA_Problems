import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximum_Subarray_value_HR {
    public static void main(String[] args) {
        List<Integer>lst=new ArrayList<>();
        lst.add(3);
        lst.add(-1);
        lst.add(-1);
        lst.add(-1);
        lst.add(5);
        lst.add(1);
        Collections.reverse(lst);
        System.out.println(lst);
        System.out.println(maxSubarrayValue(lst));
    }
    public static long maxSubarrayValue(List<Integer> arr) {
        int evenIndexNega=0;
        int evenIndexPosi=0;
        int oddIndexNega=0;
        int oddIndexPosi=0;
        for(int i=0;i<arr.size();i++){
            if(i%2==0){
                if(arr.get(i)>0){
                    evenIndexPosi+=arr.get(i);
                }else {
                    evenIndexNega += arr.get(i);
                }
            }else{
                if(arr.get(i)>0){
                    oddIndexPosi+=arr.get(i);
                }else {
                    oddIndexNega += arr.get(i);
                }

            }
        }
        System.out.println(oddIndexNega+" " +oddIndexPosi);
        System.out.println(evenIndexNega+" "+evenIndexPosi);

        int add=Math.subtractExact(evenIndexPosi,oddIndexNega);
        System.out.println(add);
        return add*add;
    }
}
