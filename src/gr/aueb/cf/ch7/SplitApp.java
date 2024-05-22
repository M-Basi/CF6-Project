package gr.aueb.cf.ch7;

public class SplitApp {

    public static void main(String[] args) {

//        String s = "Athens Uni of Econ and Business";
        String s = "Athens Uni        of Econ       and       Business";

//        String[] tokens = s.split(" ");
        String[] tokens = s.split(" +");    //or String[] tokens = s.split("\\s +");   1 η περισσότερα κενά

        for (String token: tokens) {
            System.out.println(token);
        }
    }
}
