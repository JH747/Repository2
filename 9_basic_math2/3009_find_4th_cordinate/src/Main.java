import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<coordinate> dots = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            dots.add(new coordinate(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
        }
        int a = 0, b = 0;
        for(int i = 0; i < 3; i++){
            coordinate tmp = dots.get(0);
            if(tmp.x == dots.get(1).x && tmp.y == dots.get(2).y){
                b = dots.get(1).y;
                a = dots.get(2).x;
                break;
            }
            else if(tmp.x == dots.get(2).x && tmp.y == dots.get(1).y){
                b = dots.get(2).y;
                a = dots.get(1).x;
                break;
            }
            dots.remove(0);
            dots.add(tmp);
        }

        System.out.println(a + " " + b);
    }
}

class coordinate{
    int x;
    int y;

    public coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
