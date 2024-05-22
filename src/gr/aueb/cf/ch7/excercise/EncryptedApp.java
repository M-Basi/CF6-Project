package gr.aueb.cf.ch7.excercise;

public class EncryptedApp {

    public static void main(String[] args) {

        String s = "Marioz 1";
        String encrypted;
        String dencrypted;

        encrypted = encrypted(s);
        StringBuilder encryptedSb = encryptedSb(s);
        System.out.println(encrypted);
        System.out.println(encryptedSb);

        dencrypted = dencrypted(encrypted);
        StringBuilder dencryptedSb = dencryptedSb(encryptedSb);
        System.out.println(dencrypted);
        System.out.println(dencryptedSb);
    }

    public static String encrypted (String s) {
        String encrypted = "";
        char letter;
        int ascii;

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            ascii = (int) letter;
            ascii += 1;
            letter = (char) ascii;
            encrypted += letter;
        }

        return encrypted;
    }

    public static StringBuilder encryptedSb (String s) {
        StringBuilder encrypted = new StringBuilder();
        char letter;
        int ascii;

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            ascii = (int) letter;
            ascii += 1;
            letter = (char) ascii;
            encrypted.append(letter);
        }

        return encrypted;
    }
    public static String dencrypted(String s) {
        String dencrypted = "";
        char letter;
        char letterNext;
        int ascii;

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            ascii = (int) letter;
            ascii -=1;
            letter = (char) ascii;
            dencrypted += letter;
        }

        return dencrypted;
    }

    public static StringBuilder dencryptedSb(StringBuilder s) {
        StringBuilder dencrypted = new StringBuilder();
        char letter;
        char letterNext;
        int ascii;

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            ascii = (int) letter;
            ascii -=1;
            letter = (char) ascii;
            dencrypted.append(letter);
        }

        return dencrypted;
    }

}
