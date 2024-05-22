package gr.aueb.cf.ch9.excercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class ConvertTxtApp {

    public static void main(String[] args) {
    File inFd = new File("D:/Desktop/CODING FACTORY/JAVA/Strings.txt");
    File outFd = new File("D:/Desktop/CODING FACTORY/JAVA/StringsOut1.txt");
    String line;
    String [][] tokens = new String[5][3];
    int x = 0;

    try (Scanner in = new Scanner(inFd)) {
        PrintStream pw = new PrintStream(outFd, StandardCharsets.UTF_8);
        while (in.hasNextLine()) {
            line = in.nextLine();
            tokens[x] = line.split(",");
            x++;
        }


        for (int y = 0; y < tokens.length; y++) {
            for(int z = 0; z< tokens[y].length; z++) {
                System.out.print(tokens[y][z] + " ");
            }
            System.out.println();
        }
        System.out.println(x);

        for (int i = 0; i < x-1 ; i++) {
            for (int y = 0; y < tokens[i].length; y++ ) {
                pw.printf("{ %s: %s, },", tokens[0][y], tokens[i+1][y]);
            }
           pw.flush();     //τα γραφει απευθειας. δεν καθυστερει να τα μαζεψει και να τα γραψει όλα μαζι
           pw.println();
        }

        System.out.println("Ok");
    } catch (IOException e) {
        e.printStackTrace();
        }

}
}

