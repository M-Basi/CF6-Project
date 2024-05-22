package gr.aueb.cf.ch8;

import java.io.IOException;

public class ThrowsVsTryCatch {


    // 3 ΤΡΟΠΟΙ
//    public static void main(String[] args) throws IOException {
//        char ch = (char) System.in.read();
//    }

//    public static void main(String[] args) {
//        try {
//            char ch = (char) System.in.read();
//        }catch (IOException e) {
//            System.out.println("IO Exception");
//        }
//    }

        public static void main(String[] args) throws IOException {
        try {
            char ch = (char) System.in.read();
        }catch (IOException e) {
            System.out.println("IO Exception");
            throw e;
        }
    }
}
