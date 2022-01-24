import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        String[][] strr = func(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                bw.write(strr[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }


    public static String[][] func(int p){

        if(p == 3){
            String[][] arr = new String[3][3];
            arr[0][0] = "*";
            arr[0][1] = "*";
            arr[0][2] = "*";
            arr[1][0] = "*";
            arr[1][1] = " ";
            arr[1][2] = "*";
            arr[2][0] = "*";
            arr[2][1] = "*";
            arr[2][2] = "*";
            return arr;
        }
        else{
            int q = p/3;
            String arr2[][] = func(p/3);

            String[][] arr = new String[p][p];
            for(int i = 0; i <= q*2; i+=q){
                for(int j = 0; j <= q*2; j+=q){
                    for(int m = 0; m < q; m++){
                        for(int n = 0; n < q; n++){
                            if(i==q && j==q) arr[m+i][n+j] = " ";
                            else arr[m+i][n+j] = arr2[m][n];
                        }
                    }
                }
            }

            return arr;
        }
    }
}
