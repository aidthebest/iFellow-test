import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {
    public static void main(String[] args) {
        String txt = "Hello";
        int length = 0;
        Matcher match = Pattern.compile("(.)\\1+").matcher(txt);
        while (match.find()) {
            String sub = match.group();
            System.out.println(sub);
            if (sub.length() > length) {
                length = sub.length();
            }
        }
        System.out.println("\nmaxLen: " + length);
    }
}
