public class Minimum_Penalty_For_a_Shop_LC {
    public static void main(String[] args) {
        String str="YYNY";
        System.out.println(bestClosingTime(str));
    }
    public static int bestClosingTime(String customers) {
        int maxScore=0,score=0,hours=-1;
        for (int i = 0; i < customers.length(); ++i) {
            score=score+((customers.charAt(i)=='Y') ? 1 : -1);
            if(score>maxScore){
                maxScore=score;
                hours=i;
            }
        }
        return hours +1;
    }
}
