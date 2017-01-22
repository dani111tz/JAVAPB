import java.util.Scanner;

/**
 * Created by Daniel on 11.10.2016 г..
 */
public class minutesseconds {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());

        int totalseconds = a + b + c;
        int minutes = (a + b + c) / 60;
        int seconds = (totalseconds % 60);
        System.out.printf("%d :%02d", minutes, seconds);


    }
}
