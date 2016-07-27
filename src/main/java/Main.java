import java.io.FileNotFoundException;

/**
 * @author: Bauka23
 * @creation_date: 27.07.16
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String text = FileWorker.read("resources/text.in");
        FileWorker.write("resources/text.out", Compresser.compress(text));
    }
}
