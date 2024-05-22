package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("D:/Desktop/CODING FACTORY/JAVA/Strings.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()){
                line = in.nextLine();
            tokens = line.split(" +");   //ενα ή περισσότερα κενά

            for(String token: tokens) {
                System.out.println(token + " ");
            }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
