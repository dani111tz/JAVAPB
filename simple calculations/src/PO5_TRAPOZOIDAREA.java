import java.util.Scanner;

/**
 * Created by Daniel on 04.10.2016 г..
 */
public class PO5_TRAPOZOIDAREA {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double b1 = Double.parseDouble(console.nextLine());
        double b2 = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        double area = (b1 + b2) * h/2;
        System.out.println("Trapezoidarea=" + area);


    }
}
