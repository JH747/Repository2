import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> list_a = new ArrayList<>();
        List<Integer> list_b = new ArrayList<>();
        StringTokenizer stk;

        for(int i = 0; i < n; i++){
            stk = new StringTokenizer(sc.nextLine());
            list_a.add(Integer.parseInt(stk.nextToken()));
            list_b.add(Integer.parseInt(stk.nextToken()));
        }
        sc.close();

        for(int i = 0; i < n; i++){
            System.out.println("Case #" + (i+1) + ": " + list_a.get(i) + " + "+ list_b.get(i) + " = " + (list_a.get(i) + list_b.get(i)));
        }
    }
}