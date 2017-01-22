import java.util.Scanner;

/**
 * Created by Daniel on 08.10.2016 г..
 */
public class evenorodd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        if (num%2== 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}