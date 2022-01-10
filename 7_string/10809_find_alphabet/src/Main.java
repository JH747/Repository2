import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close(); // 97 122
        int[] arr = new int[123];
        for(int i = 97; i <= 122; i++){
            arr[i] = -1;
        }
        for(int i = str.length() - 1; i >= 0; i--){
            arr[str.charAt(i)] = i;
        }
        for(int i = 97; i <= 122; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
