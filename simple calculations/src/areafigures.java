    import com.sun.org.apache.xpath.internal.SourceTree;

    import java.util.Scanner;

    /**
     * Created by Daniel on 15.10.2016 г..
     */
    public class areafigures {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            String figure = console.nextLine();


            if (figure.equals("square")) {
                double a = Double.parseDouble(console.nextLine());
                double areasquare = a * a;
                System.out.printf("%.3f", areasquare);

            } else if(figure.equals("circle")) {
                double r = Double.parseDouble(console.nextLine());
                double areacircle = Math.PI * r * r;
                System.out.printf("%.3f", areacircle);

            }else if (figure.equals("rectangle")) {
                double a = Double.parseDouble(console.nextLine());
                double b = Double.parseDouble(console.nextLine());
                double arearectangle = a * b;
                System.out.printf("%.3f", arearectangle);

            }else if(figure.equals("triangle")) {
                double a = Double.parseDouble(console.nextLine());
                double h = Double.parseDouble(console.nextLine());
                double areatriangle = (a * h)/2;
                System.out.printf("%.3f",areatriangle );





            }
        }
    }
