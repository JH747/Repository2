import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = 600;
        while(n != 0){
            m++;
            if(Integer.toString(m).contains("666")){
                n--;
            }
        }

        System.out.println(m);
    }
}
