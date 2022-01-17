import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // count down from n subtract if not g_word
        int cnt = n;
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            // 0 if not used, 1 if used
            int[] first_use_checker = new int[123]; // a 97 z 122
            int[] last_location = new int[123];
            for(int j = 0; j < str.length(); j++){
                //first use
                if(first_use_checker[str.charAt(j)] == 0){
                    last_location[str.charAt(j)] = j;
                    first_use_checker[str.charAt(j)] = 1;
                    //System.out.println(111);
                }
                //multiple use
                else{
                    //System.out.println(222);
                    if(last_location[str.charAt(j)] != j-1){
                        cnt--;
                        //System.out.println(333);
                        break;
                    }
                    else last_location[str.charAt(j)] = j;
                }
            }
        }
        br.close();
        System.out.println(cnt);
    }
}
