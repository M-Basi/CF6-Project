package gr.aueb.cf.ch6.exercise6A;

public class PositivesNumbersCheckApp {

    public static void main(String[] args) {
        int[] arr = {13,2,7,4,9,3};
        boolean isPositive = true;

        isPositive = isPositivesNumbers(arr);

        if(arr==null || arr.length==0) {
            System.out.println("The list is empty");
        }else {
            System.out.printf("The arr {13,2,7,4,-9,3} has only positive nunbers? %s", isPositive);
        }

    }

    public static boolean isPositivesNumbers (int[]arr) {

        boolean isNegative = true;
        for (int item: arr) {
            if (item < 0){
                isNegative = false;
                break;
            }
        }
        return isNegative;
    }
}
