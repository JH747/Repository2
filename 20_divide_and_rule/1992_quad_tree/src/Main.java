import java.io.*;

public class Main {

    static char[][] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        partition(0, 0, N);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void partition(int ver, int hor, int size){
        if(compressCheck(ver, hor, size)){
            sb.append(arr[ver][hor]);
            return;
        }
        sb.append('(');
        int h_size = size / 2;
        partition(ver, hor, h_size);
        partition(ver, hor + h_size, h_size);
        partition(ver + h_size, hor, h_size);
        partition(ver + h_size, hor + h_size, h_size);
        sb.append(')');
    }

    public static boolean compressCheck(int ver, int hor, int size){
        int num = arr[ver][hor];
        for(int i = ver; i < ver + size; i++){
            for(int j = hor; j < hor + size; j++){
                if(arr[i][j] != num) return false;
            }
        }
        return true;
    }
}
