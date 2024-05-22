package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές από
 * αστερακια σε αυξουσα σειρα,
 * 1η σειρα -> 1 αστερακι
 * 2η σειρά -> 2 αστερακια
 * κ.ο.κ
 */
public class Stars10Asc {

    public static void main(String[] args) {

        for (int i=1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
