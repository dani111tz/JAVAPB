import java.util.Scanner;

/**
 * Created by Daniel on 20.10.2016 г..
 */
public class daysofweek {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int day = Integer.parseInt(console.nextLine());
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
            System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Error");

        }
    }
}
