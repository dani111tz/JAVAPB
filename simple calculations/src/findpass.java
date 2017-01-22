import java.util.Scanner;

/**
 * Created by Daniel on 10.10.2016 г..
 */
public class findpass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String pass = console.nextLine();
        if (pass.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else  {
            System.out.println("Wrong password");
        }
    }
}


