package chapter3;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("D:\\PersonalProject\\head-first-designPattern\\example\\src\\chapter3\\test.txt")));

            while (( c= in.read()) >= 0 ) {
                System.out.println((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
