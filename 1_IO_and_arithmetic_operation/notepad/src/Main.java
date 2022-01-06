import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        StringTokenizer st1 = new StringTokenizer(sc1.nextLine());
        sc1.close();

        Scanner sc2 = new Scanner(System.in);
        StringTokenizer st2 = new StringTokenizer(sc2.nextLine());
        sc2.close();

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

    }
}