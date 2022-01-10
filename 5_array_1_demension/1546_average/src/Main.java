import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        StringTokenizer stk = new StringTokenizer(sc.nextLine());
        sc.close();
        double[] arr = new double[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        double max = arr[0];
        for(int i = 0; i < n; i++){
            if(max < arr[i]) max = arr[i];
        }
        double avg = 0;
        for(int i = 0; i < n; i++){
            avg += (arr[i]/max)*100;
        }
        avg /= n;
        System.out.println(avg);
    }
}
