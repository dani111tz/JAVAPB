import java.util.Scanner;
/**
 * Created by Daniel on 08.10.2016 г..
 */
public class bonuspoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        double bonuspoints = 0;

        if (num > 1000) {
            bonuspoints = num * 0.1;
        } else if (num > 100) {
            bonuspoints = num * 0.2;
        } else if (num <= 100) {
            bonuspoints = 5;
        }

        if (num % 2 == 0) {
            bonuspoints = bonuspoints + 1;
        } else if (num % 10 == 5) {
            bonuspoints = bonuspoints + 2;


        }
        System.out.println(bonuspoints);
        System.out.println(num + bonuspoints);
    }
}

