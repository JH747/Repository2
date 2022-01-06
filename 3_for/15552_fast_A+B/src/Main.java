import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        List<Integer> a_list = new ArrayList<>();
        List<Integer> b_list = new ArrayList<>();
        try{
            n = sc.nextInt();
            for(int i = 0; i < n; i++){
                a_list.add(sc.nextInt());
                b_list.add(sc.nextInt());
            }
            sc.close();
        }
        catch (InputMismatchException e){
            e.printStackTrace();
        }
        for(int i = 0; i < n; i++){
            System.out.println(a_list.get(i)+b_list.get(i));
        }
    }
}