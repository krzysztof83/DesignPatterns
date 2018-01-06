import java.io.*;

/**
 * Created by Professional on 2018-01-06.
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }



}
