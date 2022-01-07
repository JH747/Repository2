import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 1; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int cnt = -1;
        for(int i = 1; i < 10; i++){
            if(max < arr[i]){
                max = arr[i];
                cnt = i;
            }
        }
        System.out.println(max + "\n" + cnt);
    }
}