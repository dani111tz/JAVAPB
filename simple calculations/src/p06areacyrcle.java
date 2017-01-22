import java.util.Scanner;

/**
 * Created by Daniel on 04.10.2016 г..
 */
public class p06areacyrcle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
            double r = Double.parseDouble(console.nextLine());
        double area = Math.PI *r*r;
        double perimeter = 2 * Math.PI *r;
        System.out.println(area);
        System.out.println(perimeter);

    }
}
