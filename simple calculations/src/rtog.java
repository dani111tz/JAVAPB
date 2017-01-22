import java.util.Scanner;

/**
 * Created by Daniel on 07.10.2016 г..
 */
public class rtog {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double R = Double.parseDouble(console.nextLine());
        double D = R*180/Math.PI;
        System.out.println("D = " + D);
    }
}
