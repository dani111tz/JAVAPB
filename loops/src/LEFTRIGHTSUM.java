import java.util.Scanner;

/**
 * Created by Daniel on 18.11.2016 г..
 */
public class LEFTRIGHTSUM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int leftsum=0;
        int rightsum=0;
        for (int i = 0; i <n ; i++) {
            int num = Integer.parseInt(console.nextLine());
            leftsum=leftsum +num;
        }
        for (int i = 0; i <n ; i++) {
            int num = Integer.parseInt(console.nextLine());
            rightsum=rightsum + num;}
        if (leftsum==rightsum) {
            System.out.println("Yes, sum = " + leftsum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftsum-rightsum));

        }

    }

}
