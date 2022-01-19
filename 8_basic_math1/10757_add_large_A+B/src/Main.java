import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringTokenizer stk = new StringTokenizer(sc.nextLine());
        String fn = stk.nextToken();
        String sn = stk.nextToken();
        sc.close();

        List<Integer> fn_l = new ArrayList<>();
        List<Integer> sn_l = new ArrayList<>();
        for(int i = fn.length()-1; i >= 0; i--){
            fn_l.add(Integer.parseInt(Character.toString(fn.charAt(i))));
        }
        for(int i = sn.length()-1; i >= 0; i--){
            sn_l.add(Integer.parseInt(Character.toString(sn.charAt(i))));
        }

        List<Integer> sum_l = new ArrayList<>();

        int n_length = 0;
        int m_length = 0;
        int upper = 0;
        if(fn.length() <= sn.length()){
            for(int i = 0; i < fn.length(); i++){
                int a = fn_l.get(i) + sn_l.get(i) + upper;
                if(a >= 10){
                    upper = 1;
                    a -= 10;
                }
                else upper = 0;
                sum_l.add(a);
            }
            for(int i = fn.length(); i < sn.length(); i++){
                int a = sn_l.get(i) + upper;
                if(a >= 10){
                    upper = 1;
                    a -= 10;
                }
                else upper = 0;
                sum_l.add(a);
            }
            if(upper != 0) sum_l.add(upper);
        }
        else{
            for(int i = 0; i < sn.length(); i++){
                int a = fn_l.get(i) + sn_l.get(i) + upper;
                if(a >= 10){
                    upper = 1;
                    a -= 10;
                }
                else upper = 0;
                sum_l.add(a);
            }
            for(int i = sn.length(); i < fn.length(); i++){
                int a = fn_l.get(i) + upper;
                if(a >= 10){
                    upper = 1;
                    a -= 10;
                }
                else upper = 0;
                sum_l.add(a);
            }
            if(upper != 0) sum_l.add(upper);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = sum_l.size()-1; i >= 0; i--){
            sb.append(sum_l.get(i));
        }

        System.out.println(sb.toString());
    }
}
