package gr.aueb.cf.ch6.exercise6A;

public class NegativeNumberCheckApp {

    public static void main(String[] args) {
        int[] arr = {13,2,7,4,-9,3};
        boolean isNegative = false;

        isNegative = isNegativeNumber(arr);

        if(arr==null || arr.length==0) {
            System.out.println("The list is empty");
        }else {
            System.out.printf("The arr {13,2,7,4,-9,3} has negative nunber? %s", isNegative);
        }

    }

    public static boolean isNegativeNumber (int[]arr) {
        boolean isNegative = false;
        for (int item: arr) {
            if (item < 0){
                isNegative = true;
                break;
            }
        }
        return isNegative;
    }
}
