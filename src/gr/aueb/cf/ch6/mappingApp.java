package gr.aueb.cf.ch6;

public class mappingApp {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] mappedArray = mapDouble(arr);
        traverseArray(mappedArray);
    }

    /**
     * Double the value of each item of the
     * array
     * @param array     the input array
     * @return          a new array with elements
     *                  equal to double  the initial
     *                  array elements
     */
    public static int[] mapDouble (int[] array) {
        int[] arrayToReturn = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayToReturn[i] = array[i] * 2;
        }
        return arrayToReturn;
    }

    public static void traverseArray (int[] arr) {
        for (int element: arr) {
            System.out.print(element + " ");
        }
    }
}
