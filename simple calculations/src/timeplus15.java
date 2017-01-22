import java.util.Scanner;

/**
 * Created by Daniel on 12.10.2016 г..
 */
public class timeplus15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hour = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());
        int newminutes = minutes + 15;
        if (newminutes>=60){hour=hour+1;}
        if (newminutes>=60){newminutes=newminutes - 60;}
        if (hour>23){hour=0;}

        System.out.printf("%d:%02d",hour,newminutes);
    }
}


