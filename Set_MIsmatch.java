import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Set_MIsmatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrors(arr)));
    }
    public static int[] findErrors(int[] nums){
        List<Integer> lst=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(i+1)){
                map.put(i+1,map.get(i+1)+1);
            }else{
                map.put(i+1,1);
            }
        }
        for(int i : map.keySet()){
            if(map.get(i)>1){
                lst.add(i);
            }
        }
        int[] arr=new int[2];
        return arr;
    }

}
