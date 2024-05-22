package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyApp {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("D:/Desktop/CODING FACTORY/JAVA/7η εβδομαδα/kefali.jpg");
             FileOutputStream fos = new FileOutputStream("D:/Desktop/CODING FACTORY/JAVA/7η εβδομαδα/kefali-out.jpg")) {


            int b;
            int count = 0;
            long start;
            long end;
            double elapseTime = 0.0;

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                count ++;
            }
            end = System.currentTimeMillis();
            elapseTime = (end - start) / 1000.0;

            System.out.printf("Το αρχείο με μέγεθος %d KB (%d bytes) αντιγράφηκε επιτυχώς", count / 1024, count);
            System.out.println("Elapsed time: " + elapseTime + " seconds");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
