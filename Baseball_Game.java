import java.util.ArrayList;
import java.util.List;

public class Baseball_Game {
    public static void main(String[] args) {
        String[] str={"5","2","4","C","D","+"};
        System.out.println(game(str));
    }
    public static int game(String[] str){
        int result=0;
        List<Integer>lst=new ArrayList<>();
        int i=0;

        while (i<str.length){
            if(!str[i].equals("C")&&!str[i].equals("D")&&!str[i].equals("+")){
                int temp=Integer.parseInt(str[i]);
                lst.add(temp);
            } else if (str[i].equals("C")) {
                lst.remove(lst.size()-1);

            }else if(str[i].equals("D")){
                int mul=lst.get(lst.size()-1)*lst.get(lst.size()-2);
                lst.remove(lst.size()-1);
                lst.add(mul);

            }else{
                int mul=lst.get(lst.size()-1)+lst.get(lst.size()-2);
                lst.add(mul);
                System.out.println(lst);
            }
            i++;
        }
        for (int num: lst) {
            result+=num;
        }
        return result;
    }
}
