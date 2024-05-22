package gr.aueb.cf.ch4;

import javax.swing.plaf.synth.SynthPopupMenuUI;

/**
 * Demo of surrogate pairs
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int smiley = 0x1F600;   //UTF-8 smiley

        System.out.println("Smile: \uD83D\uDE00");

        System.out.print("Smiley: ");
        System.out.println(Character.toChars(smiley));
    }
}
