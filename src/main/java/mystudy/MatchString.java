package mystudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchString {
    public static void main(String[] args) {
        String str = "Check it and then finish";
        Pattern p = Pattern.compile("and");
        Matcher m = p.matcher(str);
        System.out.println(m.matches());
    }
}
