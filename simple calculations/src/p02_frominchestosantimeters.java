import java.util.Scanner;

/**
 * Created by Daniel on 01.10.2016 г..
 */
public class p02_frominchestosantimeters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("inches: ");
        double inches= Double.parseDouble(console.nextLine());
        double centimeters = inches * 2.54;
        System.out.println("centimeters =" + centimeters);



    }
}
