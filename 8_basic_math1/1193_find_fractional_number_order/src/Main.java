import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int line = 1;
        int cnt = 0;
        int remain = 0;
        while(true){
            cnt += line;

            if(n <= cnt){
                remain = cnt - n;
                break;
            }
            line++;
        }
        int a, b;
        if(line % 2 == 0){
            a = line - remain;
            b = 1 + remain;
        }
        else{
            a = 1 + remain;
            b = line - remain;
        }
        System.out.println(a + "/" + b);
    }
}

