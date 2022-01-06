import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringTokenizer stk;
        stk = new StringTokenizer(sc.nextLine());
        int n = Integer.parseInt(stk.nextToken());
        int x = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(sc.nextLine());
        sc.close();
        List<Integer> tmp_l = new ArrayList<>();
        while(stk.hasMoreTokens()){
            tmp_l.add(Integer.parseInt(stk.nextToken()));
        }
        for(int i : tmp_l){
            if(i < x) System.out.print(i + " ");
        }
    }
}
