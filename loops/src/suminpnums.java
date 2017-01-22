import java.util.Scanner;

/**
 * Created by Daniel on 18.11.2016 г..
 */
public class suminpnums {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum=0;
        for (int i = 0; i <n ; i++) {
            int a = Integer.parseInt(console.nextLine());
            sum += a;


        }
        System.out.println(sum);
    }
}
