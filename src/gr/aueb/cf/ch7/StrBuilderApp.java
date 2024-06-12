package gr.aueb.cf.ch7;

public class StrBuilderApp {

    public static void main(String[] args) {

        String concatStr = "";
        StringBuilder sb  = new StringBuilder();    //για δημιουργία string μέσω append

        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapseTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();

        for (int i = 1; i <= 100_000; i++) {
            concatStr += i;     // concatStr = concatStr + i
        }

        timeEnd = System.currentTimeMillis();
        stringElapseTime = (timeEnd - timeStart) / 1000.0;   //

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
             sb.append(i);     // concatStr = concatStr + i
        }



        timeEnd = System.currentTimeMillis();
        sbElapsedTime = (timeEnd - timeStart) / 1000.0;   //

        System.out.println("String Elapsed Time: " + stringElapseTime + " seconds");
        System.out.println("String Elapsed Time: " + sbElapsedTime + " seconds");


    }
}
