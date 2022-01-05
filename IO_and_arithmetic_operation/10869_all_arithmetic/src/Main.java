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
        int result1 = A + B;
        int result2 = A - B;
        int result3 = A * B;
        int result4 = A / B;
        int result5 = A % B;
        System.out.println(result1 +"\n"+ result2 +"\n"+ result3 +"\n"+ result4 +"\n"+ result5);
    }
}