import java.util.Scanner;

/**
 * Created by Daniel on 08.10.2016 г..
 */
public class GREATERNUMBER {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}