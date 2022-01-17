import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        List<String> tmp_list = new ArrayList<>(Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="));
        int cnt = 0;
        int i = 0;
        for(i = 0; i <= str.length()-3; i++){
            if(tmp_list.contains(str.substring(i, i+3))){
                cnt++;
                i += 2;
                //System.out.println(111);
            }
            else if(tmp_list.contains(str.substring(i, i+2))){
                cnt++;
                i += 1;
                //System.out.println(222);
            }
            else{
                cnt++;
                //System.out.println(333);
            }

        }
        // manage last 2 or less letters
        if(i == str.length()-2){
            if(tmp_list.contains(str.substring(i, i+2))) cnt++;
            else cnt += 2;
            //System.out.println(444);
        }
        else if(i == str.length()-1){
            cnt++;
            //System.out.println(555);
        }

        System.out.println(cnt);
    }
}
