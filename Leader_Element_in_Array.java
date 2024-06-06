import java.util.ArrayList;
import java.util.List;

public class Leader_Element_in_Array {
    public static void main(String[] args) {
        int[] arr={4,5,6,3,1,2};
        System.out.println(findLeader(arr));
    }
    public  static List<Integer> findLeader(int [] arr){
        List<Integer>lst=new ArrayList<>();
        lst.add(arr[arr.length-1]);
        int i= arr.length-1;
        while (i>0){
            if(arr[i]<arr[i-1]){
                lst.add(arr[i-1]);
                i=i-1;
            }else{
                i--;
            }
        }
       return lst;
    }
//    public static List<Integer> findLeader(int [] arr){
//        List<Integer>lst=new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[i]<arr[j]) {
//                    i = j;
//                    break;
//                }else if(j== arr.length-1){
//                    lst.add(arr[i]);
//                }
//            }
//        }
//        lst.add(arr[arr.length-1]);
//        return lst;
//    }
}
