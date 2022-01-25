import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Action> actionList = new ArrayList<>();
        hanoi(actionList, 1, 3, n);

        //System.out.println(actionList.size());

        StringBuilder sb = new StringBuilder();
        sb.append(actionList.size()).append("\n");
        for(Action ac : actionList){
            sb.append(ac.st).append(" ").append(ac.dest).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void hanoi(List<Action> list, int star, int fin, int num){
        if(num == 1) list.add(new Action(star, fin));
        else{
            int left;
            if(star != 1 && fin != 1) left = 1;
            else if(star != 2 && fin != 2) left = 2;
            else left = 3;
            //
            hanoi(list, star, left, num-1);
            list.add(new Action(star, fin));
            hanoi(list, left, fin, num-1);

        }
    }
}

class Action{
    int st;
    int dest;

    public Action(int st, int dest) {
        this.st = st;
        this.dest = dest;
    }
}