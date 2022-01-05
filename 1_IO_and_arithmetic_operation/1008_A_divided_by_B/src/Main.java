import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double A = 0, B = 0;
        try{
            A = sc.nextInt();
            B = sc.nextInt();
            sc.close();
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        double C = A / B;
        System.out.println(C);
    }
}