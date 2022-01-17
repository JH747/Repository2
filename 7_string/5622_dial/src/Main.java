import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        // A 65 Z 90
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            char n = str.charAt(i);
            if(n < 68) cnt += 3;
            else if(n < 71) cnt += 4;
            else if(n < 74) cnt += 5;
            else if(n < 77) cnt += 6;
            else if(n < 80) cnt += 7;
            else if(n < 84) cnt += 8;
            else if(n < 87) cnt += 9;
            else cnt += 10;
        }
        System.out.println(cnt);
    }
}
