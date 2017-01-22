import java.util.Scanner;

/**
 * Created by Daniel on 10.10.2016 г..
 */
public class compare3numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        if (a+b+c==(3*a)){
            System.out.println("yes");}
        else{
            System.out.println("no");}

    }
}
