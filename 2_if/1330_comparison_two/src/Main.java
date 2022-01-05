import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 0;
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            sc.close();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        if(a > b) System.out.println(">");
        else if(a == b) System.out.println("==");
        else System.out.println("<");
    }
}
