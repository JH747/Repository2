import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int i){
        if(i == 0) return 0;
        else if(i == 1) return 1;
        else{
            return fib(i-1) + fib(i-2);
        }
    }
}
