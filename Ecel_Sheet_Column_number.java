public class Ecel_Sheet_Column_number {
    public static void main(String[] args) {
        String str="ABC";
        System.out.println(titleToNumber(str));
    }
    public static int titleToNumber(String str) {
        int power= str.length()-1;
        char[] alpha=new char[26];
        char value='A';
        for(int i=0; i<alpha.length;i++){
            alpha[i]=value;
            value++;
        }
        int c=0;
        int ans=0;
        int i=0;
        while (i<alpha.length){
            if(alpha[i]==str.charAt(c)){
                ans=ans+(i+1)*p(power);
                power--;
                c++;
                i=0;
            }else{
                i++;
            }
            if(c==str.length()){
                break;
            }
        }
        return ans;
    }
    public static int p(int a){
        if(a==0){
            return 1;
        }
        int temp=1;
        while(a>0){
            temp=temp*26;
            a--;
        }
        return temp;
    }
}
