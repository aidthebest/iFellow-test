import java.util.Scanner;

public class BaseConverter {

    // насколько понял задание, вероятно не до конца

    public static void main (String[] args) {
        double cels;
        double faren;
        double kelv;

        System.out.println("Enter cels degree:");
        cels = new Scanner(System.in).nextDouble();
        faren = cels * 1.8 + 32;
        System.out.println("Your degree if faren =" + faren);
        kelv = cels + 274.15;
        System.out.println("Your degree if kelv =" + kelv);
    }

    public String convert (double celc) {
        double faren = celc * 1.8 + 32;
        double kelv = celc + 274.15;
        return ("temp in farengate = " + faren + "temp in kelvin = " + kelv);
    }
}
