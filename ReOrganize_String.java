import java.util.HashMap;
import java.util.PriorityQueue;

public class ReOrganize_String {
    public void main(String[] args) {
        String str="aabca";
        System.out.println(reorganizeString(str));
    }
    public  class pair{
        char ch;
        int f;
        public pair(char ch,int f){
            this.ch=ch;
            this.f=f;
        }
    }
    public String reorganizeString(String s) {
        int [] map=new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)-'a']++;
        }
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->(b.f-a.f));
        for (int i = 0; i < 26; i++) {
            if(map[i]>0){
                pq.add(new pair((char)('a'+i),map[i]));
            }
        }
        StringBuilder ans=new StringBuilder();
        pair block=pq.poll();
        if(block.f>s.length()/2+1){
            return "";
        }
        ans.append(block.ch);
        block.f--;
        while (pq.size()>0){
            pair temp=pq.poll();
            ans.append(temp.ch);
            temp.f--;
            if(block.f>0){
                pq.add(block);
            }
            block=temp;
        }
        return ans.toString();
    }
}
