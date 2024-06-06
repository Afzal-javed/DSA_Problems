public class String_Equals {
    public static void main(String[] args) {
        String str="BAOOLLNNOLOLGBAX";
        System.out.println(stringEqual(str));
    }
    public static int stringEqual(String str){
        int ans=0;
        int [] freq=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'A']++;
        }
        int a=0,b=0,l=0,o=0,n=0;
        for (int i = 0; i < freq.length; i++) {
            if(i==0||i==1||i==11||i==13||i==14){
                if(freq[i]==0) return 0;
                else if(i==0){
                    a=freq[i];
                }else if(i==1){
                    b=freq[i];
                }else if(i==11){
                    l=freq[i];
                }else if(i==13){
                    n=freq[i];
                }else if(i==14){
                    o=freq[i];
                }
            }

        }
        int ab=Math.min(a,b);
        int c=Math.min(n,ab);
        int lo=Math.min(l,o);
        int half=lo/c;
         ans=Math.min(half,c);
        return ans;
    }

}
