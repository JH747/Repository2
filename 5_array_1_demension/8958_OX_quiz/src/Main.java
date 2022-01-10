import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] str_arr = new String[n];
        for(int i = 0; i < n; i++){
            str_arr[i] = sc.nextLine();
        }
        int[] score_arr = new int[n];

        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < str_arr[i].length(); j++){
                if(str_arr[i].charAt(j) == 'O'){
                    cnt++;
                    score_arr[i] += cnt;
                }
                else cnt = 0;
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(score_arr[i]);
        }

    }
}
