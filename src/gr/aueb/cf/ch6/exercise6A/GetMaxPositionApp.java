package gr.aueb.cf.ch6.exercise6A;

public class GetMaxPositionApp {

    public static void main(String[] args) {
        int[] arr = {13,2,28,4,9,3};

        int maxPosition = 0;
        maxPosition = getMaxPosition2(arr);
        if (maxPosition == -1) {
            System.out.printf("Error in searching...");
        }

        System.out.printf("Max value: %d. maxPosition: %d", arr[maxPosition], maxPosition + 1);
    }

    public static int getMaxPosition1(int[] arr) {
        int maxPosition = 0;
        int max = arr[maxPosition];
        if (arr == null) return -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max ) {
                maxPosition = i;
                max = arr[i];
                i++;
            }
        }
        return maxPosition;
    }

    public static int getMaxPosition2(int[] arr) {
        int maxPosition = 0;
        int max = Integer.MIN_VALUE;
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                maxPosition = i;
                max = arr[i];
                i++;
            }
        }
        return maxPosition;
    }

}
