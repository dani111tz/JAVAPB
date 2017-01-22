import java.util.Scanner;

/**
 * Created by Daniel on 18.11.2016 г..
 */
public class maxnumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());

            if (num > max) {
                max = num;
            }
            System.out.println(max);
        }
    }

}