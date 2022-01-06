import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringTokenizer st1 = new StringTokenizer(sc.nextLine());
        //sc.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer("");
        try{
            st2 = new StringTokenizer(br.readLine());
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

    }
}