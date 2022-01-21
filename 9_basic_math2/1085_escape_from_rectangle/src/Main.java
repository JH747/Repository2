import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());
        int w = Integer.parseInt(stk.nextToken());
        int h = Integer.parseInt(stk.nextToken());

        int min_dist_horizontal = Math.min(x, w-x);
        int min_dist_vertical = Math.min(y, h-y);
        int min_dist = Math.min(min_dist_horizontal, min_dist_vertical);
        System.out.println(min_dist);

    }
}
