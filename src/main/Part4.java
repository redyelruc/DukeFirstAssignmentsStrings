import edu.duke.URLResource;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.stream.StreamSupport;

public class Part4 {

    public void printing() {
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String s : ur.lines()) {
            String sLower = s.toLowerCase();
            String patternString = ".*https://www.youtube.com.*";
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(sLower);
            if (!matcher.matches()){
                continue;
            }
            int startIndex = sLower.indexOf("https://www.youtube.com");
            int stopIndex = sLower.indexOf("\"", startIndex +1) + 1;
            String webAddress = s.substring(startIndex, stopIndex);
            System.out.println(webAddress);

        }
    }

//    public void printing() {
//        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
//        ur.lines().forEach(System.out::println);
//    }

    public static void main(String[] args) {
        Part4 p4 = new Part4();
        p4.printing();

    }
}
