import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int cnt = 0;
        sc.close();
        do{
            m = func1(m);
            cnt++;
        }
        while(m != n);
        System.out.println(cnt);
    }

    public static int func1(int n){
        int digit_ten = n / 10;
        int digit_one = n % 10;
        int digit_tmp = (digit_ten + digit_one) % 10;
        int digit_new = digit_one*10 + digit_tmp;
        return digit_new;
    }
}

