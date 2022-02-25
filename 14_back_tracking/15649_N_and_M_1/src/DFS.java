//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class DFS {
//
//    static int N;
//    static int M;
//    static int Counter = 0;
//    static List<Integer>[] adjacent;
//    static Stack<Integer> stack = new Stack<>();
//    static boolean[] visited;
//    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        M = sc.nextInt();
//        adjacent = new List[N+1];
//        for(int i = 1; i <= N; i++){
//            List<Integer> tmp = new ArrayList<>();
//            for(int j = 1; j <= N; j++){
//                if(j != i) tmp.add(j);
//            }
//            adjacent[i] = tmp;
//        }
//
//        visited = new boolean[N+1];
//
//        for(int i = 1; i <= N; i++){
//            DFS(i);
//            bw.newLine();
//            bw.flush();
//            visited = new boolean[N+1];
//            Counter = 0;
//        }
//        bw.close();
//    }
//
//    public static void DFS(int k) throws IOException {
//        if(Counter >= M) return;
//        Counter++;
//        visited[k] = true;
//        bw.write(Integer.toString(k));
//        bw.write(" ");
//        for(int i : adjacent[k]){
//            if(!visited[i]){
//                DFS(i);
//            }
//        }
//    }
//}
