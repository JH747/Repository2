import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 1, b = 1;
        while(true){
            StringTokenizer stk = new StringTokenizer(sc.nextLine());
            a = Integer.parseInt(stk.nextToken());
            b = Integer.parseInt(stk.nextToken());
            if(a==0 && b==0) break;
            System.out.println(a+b);
        }
    }
}
