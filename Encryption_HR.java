import java.util.Arrays;

public class Encryption_HR {
    public static void main(String[] args) {
        String str="haveaniceday";
        System.out.println(encryption(str));
    }
    public static String encryption(String s){
        String str="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                str+=s.charAt(i);
            }
        }
        int len=str.length();
        Double sqrt=Math.sqrt(len);
        int row=(int)Math.floor(sqrt);
        int col=(int)Math.ceil(sqrt);
        if(row*col<len){
            row++;
        }
        char[][] arr=new char[row][col];
        int count=0;
        for (int i = 0; i < row; i++) {
            int k=0;
            while (k<col){
                if(count>=str.length()){
                    arr[i][k]=' ';
                }else{
                    arr[i][k]=str.charAt(count);
                }
                count++;
                k++;
            }
        }
//        for(int i=0;i< arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        String ans="";
        int i=0,j=0,m=0;
        while (j<col){
            while (i<row){
                if(arr[i][j]!=' '){
                    ans+=arr[i][j];
                }else{
                    break;
                }
                i++;
                m++;
            }
            ans+=' ';
            i=0;
            j++;
        }
        return ans;
    }
}
