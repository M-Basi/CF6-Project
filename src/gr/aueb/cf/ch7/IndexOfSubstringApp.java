package gr.aueb.cf.ch7;

/**
 * Demo of indexOf() and substring()
 */
public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');
        int postitonOfNexto = s.indexOf("ory", 2);
        System.out.println("Position of o: " + positionOfo);
        System.out.println("Position of next o: " + postitonOfNexto);

        String odToEnd = s.substring(1);
        System.out.println(odToEnd);

        String od = s.substring(1, 3);
        System.out.println(od);

    }
}
