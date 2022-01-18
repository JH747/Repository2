import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int x = n / 5;
        int y = n % 5;
        if(y == 0){
            System.out.println(x);
        }
        else{
            for(int i = 0; i < 3; i++){
                if(y % 3 == 0) break;
                else{
                    x -= 1;
                    y += 5;
                }
            }
            if((x < 0) || (y % 3 != 0)) System.out.println(-1);
            else System.out.println((x + y/3));
        }
    }
}
