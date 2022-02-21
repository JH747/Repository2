import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<Long, Long> map = new HashMap<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(fib(n));
    }

    public static long fib(long t){
        if(t <= 2){
            if(t == 2) return 1;
            else if(t == 1) return 1;
            else return 0;
        }
        else if(map.containsKey(t)){
            return map.get(t);
        }
        else{ // 도가뉴 항등식을 이용하여 아래를 작성
            long tmp = t/2;
            long fd2 = fib(tmp);
            if(t % 2 == 0){
                long re = (fd2*(fib(tmp-1) + fib(tmp+1))) % 1000000007;
                map.put(t, re);
                return re;
            }
            else{
                long fd2p1 = fib(tmp+1);
                long re = (fd2*fd2 + fd2p1*fd2p1) % 1000000007;
                map.put(t, re);
                return re;
            }
        }
    }
}
