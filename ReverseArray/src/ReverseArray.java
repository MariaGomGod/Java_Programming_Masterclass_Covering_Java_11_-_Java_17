import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    static void reverse(int[] array) {

        if (array != null) {
            int n = array.length;
            int half = n / 2;
            for (int i = 0; i < half; i++) {
                int left = i;
                int right = n - 1 - i;
                // We swap the elements
                swap(array, left, right);
            }
        }
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
