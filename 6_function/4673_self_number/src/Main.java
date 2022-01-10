import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> self_num_l = new ArrayList<>();
        List<Integer> d_num_l = new ArrayList<>();
        for(int i = 1; i < 9975; i++){
            d_num_l.add(self_num(i));
        }
        for(int i = 1; i <= 10000; i++){
            if(!d_num_l.contains(i)){
                self_num_l.add(i);
                System.out.println(i);
            }
        }
    }

    public static int self_num(int n){
        int result = n;
        List<Integer> tmp = new ArrayList<>();
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++){
            result += Integer.parseInt(Character.toString(str.charAt(i)));
        }
        return result;
    }
}
