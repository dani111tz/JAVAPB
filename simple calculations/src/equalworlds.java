import java.util.Scanner;

/**
 * Created by Daniel on 12.10.2016 г..
 */
public class equalworlds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word1 = console.nextLine();
        String word2 = console.nextLine();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
                if (word1.equals(word2)) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
