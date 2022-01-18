import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int cnt = 1;
        int i = 1;
        int j = 1;
        while(true){
            if(n <= (i-1)*6 + 1) break;
            cnt++;
            i += j;
            j++;
        }
        System.out.println(cnt);
    }
}
