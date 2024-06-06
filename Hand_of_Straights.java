import java.util.PriorityQueue;

public class Hand_of_Straights {
    public static void main(String[] args) {
        int [] hand={1,2,3,6,2,3,4,7,8};
        int groupSize=3;
        System.out.println(isNStraightHand(hand,groupSize));
    }
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for (int i : hand ) {
            pq.add(i);
        }
        while(!pq.isEmpty()){
            int smallest=pq.poll();
            for (int i = 1; i <groupSize ; i++) {
                if(pq.remove(smallest+i)) continue;
                else return false;
            }
        }
        return true;
    }
}
