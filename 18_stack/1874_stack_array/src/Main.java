import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> t_list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            t_list.add(Integer.parseInt(br.readLine()));
        }


    }
}
