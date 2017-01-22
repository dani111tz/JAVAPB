import java.util.Scanner;

/**
 * Created by Daniel on 01.10.2016 г..
 */
public class p_03Greeting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String name = console.nextLine();
        System.out.printf("Hello, %s!", name);

    }
}
