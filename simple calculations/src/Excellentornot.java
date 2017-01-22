import java.util.Scanner;

/**
 * Created by Daniel on 08.10.2016 г..
 */
public class Excellentornot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        if (grade >= 5.5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not Excellent.");
        }
    }
}
