import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            cnt += func_han(i);
        }
        System.out.println(cnt);
    }

    public static int func_han(int n){
        if(n < 100) return 1;
        else{
            String str = Integer.toString(n);
            int val = str.charAt(1) - str.charAt(0);
            for(int i = 1; i < str.length(); i++){
                if((str.charAt(i) - str.charAt(i-1)) != val){
                    return 0;
                }
            }
        }
        return 1;
    }
}
