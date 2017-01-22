import java.util.Scanner;

/**
 * Created by Daniel on 07.10.2016 г..
 */
public class CTOF {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double C = Double.parseDouble(console.nextLine());
        double F = ( C * 1.8) +32;
        System.out.println("F= " +F);
    }
}
