import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8 {
    public static void main(String[] args) {
        String text = "NIC \n"+"9412354678v \n"+
        "9412354238v \n"+
        "8922354678V \n"+
        "8756354678v \n"+
        "9912354735V list";

        Pattern pattern = Pattern.compile("\\b\\d{10}[Vv]\\b");
        Matcher matcher =  pattern.matcher(text);

        matcher.find();
        System.out.println(text.substring(matcher.start(), matcher.end()));
    }
}
