import java.util.Scanner;

/**
 * Created by Daniel on 01.10.2016 г..
 */
public class p04_conctinatedata {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstname = console.nextLine();
        String lastname = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String town = console.nextLine();
        System.out.println("You are "+ firstname +" " + lastname +"," +" a "+ age+ "-years old person from "+ town+"."  );

    }
}

