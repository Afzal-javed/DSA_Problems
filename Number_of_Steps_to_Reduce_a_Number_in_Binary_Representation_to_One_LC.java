public class Number_of_Steps_to_Reduce_a_Number_in_Binary_Representation_to_One_LC {
    public static void main(String[] args) {
        String s = "1111011110000011100000110001011011110010111001010111110001";
        System.out.println(numSteps(s));
    }
    //class Solution
    //{
    //    public int numSteps(String s)
    //    {
    //        int countSteps = 0;
    //        int carry = 0;
    //        for(int i = s.length()-1;i>=1;i--)
    //        {
    //            int rightMostBit = s.charAt(i)-'0';
    //            if((rightMostBit+carry) == 1)
    //            {
    //                carry=1;
    //                countSteps += 2;
    //            }
    //            else
    //            {
    //                countSteps++;
    //            }
    //        }
    //        return countSteps+carry;
    //    }
    //}
    public static int numSteps(String s) {
        int number=binaryToDecimal(s);
        if(number==1) return 0;
        int ans=0;
        while(number!=1){
            if(number%2==0){
                number=number/2;
            }else{
                number=number+1;
            }
            ans++;
        }
        return ans;
    }
    public static int binaryToDecimal(String str){
        int len=str.length()-1;
        int idx=0;
        int pow=0;
        long total=0;
        for (int i = str.length(); i >0; i--) {         //1101
            int temp=Integer.parseInt(str.substring(len-idx,i));
            total+=power(temp,pow);
            pow++;
            idx++;
        }
        System.out.println(pow);
        return -1;
    }
    public static int power(int temp,int pow){
        int sqrVal=1;
        if(temp==0) {
            return 0;
        }
        else if(pow==0){
            return 1;
        }else{
            while(pow>0){
                sqrVal=sqrVal*2;
                pow--;
            }
        }
        return sqrVal;
    }

}
