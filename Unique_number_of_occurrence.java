import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Unique_number_of_occurrence {
    public static void main(String[] args) {
        int[] arr={-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniquOccurrance(arr));
    }
    public static boolean uniquOccurrance(int[] arr){
        if(arr.length==1) return true;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           if(map.containsKey(arr[i])){
               map.put(arr[i], map.get(arr[i])+1);
           }else{
               map.put(arr[i],1);
           }
        }
        List<Integer>lst=new ArrayList<>();
        for (int i: map.keySet()) {
            if(lst.contains(map.get(i))){
                return false;
            }else{
                lst.add(map.get(i));
            }
        }
        return true;
    }
}
