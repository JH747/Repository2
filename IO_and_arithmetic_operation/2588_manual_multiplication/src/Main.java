import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = 0, B = 0;
        try{
            A = sc.nextInt();
            B = sc.nextInt();
            sc.close();
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        int digit_1 = 0;
        int digit_10 = 0;
        int digit_100 = 0;
        digit_1 = B % 10;
        digit_10 = (B % 100 - digit_1)/10;
        digit_100 = (B - digit_10 - digit_1)/100;

        System.out.println(digit_1*A + "\n" + digit_10*A + "\n" + digit_100*A + "\n" + A*B);
    }
}