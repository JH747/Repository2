import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){ // 0 to 9
            arr[i] = sc.nextInt() % 42;
        }

        for(int i = 0; i <= 8; i++){
            for(int j = i+1; j <= 9; j++){
                if(arr[i] != -1 && arr[j] != -1){
                    if(arr[i] == arr[j]) arr[j] = -1;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] != -1) cnt++;
        }
        System.out.println(cnt);

    }
}
