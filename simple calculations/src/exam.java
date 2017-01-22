import java.util.Scanner;

/**
 * Created by Daniel on 19.11.2016 г..
 */
public class exam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int bitcoins = Integer.parseInt(console.nextLine());
        int yoans = Integer.parseInt(console.nextLine());
        int comm = Integer.parseInt(console.nextLine());


        double bitcoinstoleva = 1168 *bitcoins;
        double yoanstpdolar= yoans *0.15;
        double dollarstoleva=yoanstpdolar*1.76;
        double levas=bitcoinstoleva+dollarstoleva;
        double euros=levas/1.95;
        euros= euros -((comm*euros)/100);
        System.out.println(euros);
    }
}
