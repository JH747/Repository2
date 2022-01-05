import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        try{
            a = sc.nextInt();
            sc.close();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        for(int i = 1; i < 10; i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}