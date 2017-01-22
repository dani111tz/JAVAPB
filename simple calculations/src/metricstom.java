import java.util.Scanner;

/**
 * Created by Daniel on 17.10.2016 г..
 */
public class metricstom {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double input = Double.parseDouble(console.nextLine());
        String fromunit = console.nextLine();
        String tounit = console.nextLine();
        double meters = 0;
        double converted = 0;
        if (fromunit.equals("mm")) {
            meters = input / 1000;
        } else if (fromunit.equals("cm")) {
            meters = input / 100;
        } else if (fromunit.equals("m")) {
            meters = input;
        } else if (fromunit.equals("km")) {
            meters = input / 0.001;
        } else if (fromunit.equals("in")) {
            meters = input / 39.37000787;
        } else if (fromunit.equals("yd")) {
            meters = input / 1.0936133;
        } else if (fromunit.equals("ft")) {
            meters = input / 3.2808399;
        } else if (fromunit.equals("mi")) {
            meters = input / 0.000621371192;
        }

        if (tounit.equals("mm")) {
            converted = meters * 1000;
        } else if (tounit.equals("cm")) {
            converted = meters * 100;
        } else if (tounit.equals("km")) {
            converted = meters * 0.001;
        } else if (tounit.equals("m")) {
            converted = meters;
        } else if (tounit.equals("in")) {
            converted = meters * 39.3700787;
        } else if (tounit.equals("yd")) {
            converted = meters * 1.0936133;
        } else if (tounit.equals("ft")) {
            converted = meters * 3.2808399;
        } else if (tounit.equals("mi")) {
            converted = meters * 0.000621371192;
        }

        System.out.printf("%.4f %s",converted, tounit);


        }
    }

