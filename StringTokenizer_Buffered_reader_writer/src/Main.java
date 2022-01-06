import java.io.*;
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
        sc.close();

        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            while(st1.hasMoreTokens()){
                System.out.println(st1.nextToken());
            }
            while(st2.hasMoreTokens()){
                bw.write(st2.nextToken() + "\n");
            }
            bw.flush();
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}