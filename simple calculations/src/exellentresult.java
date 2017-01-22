import java.util.Scanner;

/**
 * Created by Daniel on 08.10.2016 г..
 */
public class exellentresult {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        if (grade >= 5.50) {
            System.out.println("Exellent");

        }
    }
}