import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_item_matching {
    public static void main(String[] args) {
      int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
      int[][] nums=new int[arr.length][arr.length];
        //Output: [[1,0,0],[0,1,0],[1,1,1]}}
        System.out.println(flipAndInvertImage(arr));
    }
    public static int[][] flipAndInvertImage(int[][] img) {
        int[][] nums=new int[img.length][img.length];
        for(int i=0;i<img.length;i++){
            int k=0;
            for(int j=img[i].length-1;j>=0;j--){
                nums[i][k]=img[i][j];
                k++;
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]==0){
                    nums[i][j]=1;
                }else{
                    nums[i][j]=0;
                }
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
        return nums;
    }
}
