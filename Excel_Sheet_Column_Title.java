public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        int num=52;
        System.out.println(convertToTitle(num));
    }
        public static String convertToTitle(int columnNumber) {
            String ans = "";
            while (columnNumber>0){
                columnNumber--;
                ans = (char) ('A'+ (columnNumber%26)) + ans;
                columnNumber = columnNumber/26;
            }
            return ans;
        }

    /*public static String convertToNumber(int num) {
        char[] alpha=new char[26];
        char value='A';
        for(int i=0; i<alpha.length;i++){
            alpha[i]=value;
            value++;
        }
        StringBuilder ans=new StringBuilder();
        int rem=0;
        while (num>0){
            rem=num%26;
            if(rem==0){
                ans.append(alpha[25]);
            }else{
                ans.append(alpha[rem-1]);
            }

            num=num/26;

        }
        ans.reverse();

        return ans.toString();

    }*/
}
