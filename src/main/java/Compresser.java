import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Bauka23.
 * @creation_date: 27.07.16.
 */
public class Compresser {

    //   private static final Logger logger = LoggerFactory.getLogger(Compresser.class);

    public static String compress(String text) {
        StringBuilder sb = new StringBuilder();

        int start = 0;
        int count = 1;
        for (int i = 1; i < text.length(); i++) {

            if (text.charAt(i) == text.charAt(i - 1)) {
                count++;

                if (count < 3) {
                    sb.append(text, start, i);
                }

            } else if (count > 1) {
                sb.append(count);
                start = i;
                count = 1;
            }
        }
        sb.append(text, start, text.length());

        return sb.toString();
    }
}
