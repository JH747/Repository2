import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //find smallest sangsung
        boolean exist = false;
        for(int i = 1; i < n; i++){
            int sum = i;
            String str = Integer.toString(i); // 0 48 9 57
            for(int j = 0; j < str.length(); j++){
                sum += str.charAt(j) - 48;
            }
            if(sum == n){
                System.out.println(i);
                exist = true;
                break;
            }
        }
        if(!exist) System.out.println(0);
    }
}
