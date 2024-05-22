package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές από
 * αστερακια σε αυξουσα σειρα,
 * 1η σειρα -> 10 αστερακιa
 * 2η σειρά -> 9 αστερακια
 * κ.ο.κ
 */
public class Stars10Desc {

    public static void main(String[] args) {

        for (int i=1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}