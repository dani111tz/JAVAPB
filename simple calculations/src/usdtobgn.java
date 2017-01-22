import java.util.Scanner;

/**
 * Created by Daniel on 07.10.2016 г..
 */
public class usdtobgn {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double  BGN = Double.parseDouble(console.nextLine());
        double USD = (double)(BGN * 1.79549);
        System.out.printf(" USD = %.2f" ,USD );
    }
}
