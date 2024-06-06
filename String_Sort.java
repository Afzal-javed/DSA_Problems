public class String_Sort {
    public static void main(String[] args) {
        String str="hellomynameisafzaljaved";
        char[] strArr=str.toCharArray();
        System.out.println(sortString(strArr));

    }
    public  static String sortString(char[] str){
        String ans="";
        for (int i = 0; i < str.length; i++) {
            boolean flag=false;
            for(int j=0;j<str.length-i-1;j++){
                if(str[j]>str[j+1]){
                    swap(str,j,j+1);
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        for (char i: str) {
            ans+=i;
        }
        return ans;
    }
    public  static void swap(char[] str,int i,int j){
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }

}
