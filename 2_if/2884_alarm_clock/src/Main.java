import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = 0, m = 0;
        try{
            h = sc.nextInt();
            m = sc.nextInt();
            sc.close();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }

        if(m >= 45){
            System.out.println(h + " " + Integer.toString(m-45));
        }
        else{
            h = h -1;
            if(h<0) h = 23;
            int tmp = m - 45;
            m = 60 + tmp;
            System.out.println(h + " " + m);
        }
    }
}