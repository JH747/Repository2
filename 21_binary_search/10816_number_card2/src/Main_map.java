//import java.io.*;
//import java.util.*;
//
//public class Main_map {
//
//    static int N;
//    static int K;
//    //static int[] s_card;
//    static Map<Integer, Integer> map;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        N = Integer.parseInt(br.readLine());
//        StringTokenizer stk = new StringTokenizer(br.readLine());
//        //s_card = new int[N];
//        map = new HashMap<>();
//        for (int i = 0; i < N; i++) {
//            int key = Integer.parseInt(stk.nextToken());
//            //s_card[i] = key;
//            int val = map.getOrDefault(key, 0);
//            map.put(key, val + 1);
//        }
//        //Arrays.sort(s_card);
//
//        int M = Integer.parseInt(br.readLine());
//        stk = new StringTokenizer(br.readLine());
//        for (int i = 0; i < M; i++) {
//            K = Integer.parseInt(stk.nextToken());
//            bw.write(Integer.toString(map.getOrDefault(K, 0)));
//            bw.write(" ");
//        }
//        bw.flush();
//        bw.close();
//    }
//}