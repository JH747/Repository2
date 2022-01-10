import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        StringTokenizer[] stk_arr = new StringTokenizer[n];
        double[][] sc_arr = new double[n][];
        double[] avg_arr = new double[n];
        double[] n_arr = new double[n];

        for(int i = 0; i < n; i++){
            stk_arr[i] = new StringTokenizer(sc.nextLine());
            int m = Integer.parseInt(stk_arr[i].nextToken());
            n_arr[i] = m;
            double avg = 0;
            for(int j = 0; j < m; j++){
                sc_arr[i][j] = Integer.parseInt(stk_arr[i].nextToken());
                avg += sc_arr[i][j];
            }
            avg /= m;
            avg_arr[i] = avg;
        }

        //double[] re_arr = new double[n];
        for(int i = 0; i < n; i++){
            double cnt = 0;
            for(int j = 0; j < n_arr[i]; j++){
                if(sc_arr[i][j] > avg_arr[i]) cnt++;
            }
            System.out.println(cnt/n_arr[i]);
        }



    }
}
