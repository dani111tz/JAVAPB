import java.util.Scanner;

/**
 * Created by Daniel on 05.11.2016 г..
 */
public class num1ton3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("n= ");
        int n = Integer.parseInt(console.nextLine());
        System.out.println("The numbers are: ");
        int num=1;
        for (int i = 0; i < n; i+=2) {


            num=num*2;

            System.out.println(num);
        }
    }

}
