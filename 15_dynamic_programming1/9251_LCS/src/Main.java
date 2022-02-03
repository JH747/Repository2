import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int l1 = str1.length();
        int l2 = str2.length();

        // dp[i][j] : length of longest common sequence end at i_th, j_th element of each string
        int[][] dp = new int[2000][2000];

        int index1 = str1.indexOf(str2.charAt(0));
        int index2 = str2.indexOf(str1.charAt(0));

        // initialize dp[i][0] and dp[0][i]
        if(index1 != -1){
            for(int i = index1; i < l1; i++) dp[i][0] = 1;
        }
        if(index2 != -1){
            for(int i = index2; i < l2; i++) dp[0][i] = 1;
        }

        for(int i = 1; i < l1; i++){
            for(int j = 1; j < l2; j++){
                int tmp = 0;
                if(str1.charAt(i) == str2.charAt(j)) tmp = dp[i-1][j-1] + 1;
                else{
                    tmp = Math.max(dp[i][j-1], tmp);
                    tmp = Math.max(dp[i-1][j], tmp);
                }
                dp[i][j] = tmp;
            }
        }
        bw.write(Integer.toString(dp[l1-1][l2-1]));
        bw.flush();
        bw.close();
    }
}
