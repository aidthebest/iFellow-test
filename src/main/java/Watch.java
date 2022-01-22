import java.util.Scanner;

import static java.lang.Math.abs;

public class Watch {
    public static void main(String[] args) {
        System.out.println("Enter minutes:");
        double minutes = new Scanner(System.in).nextDouble();
        System.out.println("Enter hours:");
        double hours = new Scanner(System.in).nextDouble();
        double angle = abs((hours * 30 + minutes * 0.5) - (minutes * 6));
        System.out.println("Angle between the hands of the clock is " + angle);

        //Угол считается наименьший
    }
}
