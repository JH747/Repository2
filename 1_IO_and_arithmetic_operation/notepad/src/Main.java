import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Integer.parseInt(Character.toString(str.charAt(i)));
        }
        System.out.println(sum);
    }
}