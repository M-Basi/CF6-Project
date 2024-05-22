package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOut2App {

    public static void main(String[] args) {
        File inFd = new File("D:/Desktop/CODING FACTORY/JAVA/Strings.txt");
        File outFd = new File("D:/Desktop/CODING FACTORY/JAVA/StringsOut1.txt");
        String line;
        String [] tokens;

        try (Scanner in = new Scanner(inFd)) {
            PrintStream pw = new PrintStream(outFd, StandardCharsets.UTF_8);
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token: tokens) {
                    pw.printf("%s ", token);
                    pw.flush();     //τα γραφει απευθειας. δεν καθυστερει να τα μαζεψει και να τα γραψει όλα μαζι
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
