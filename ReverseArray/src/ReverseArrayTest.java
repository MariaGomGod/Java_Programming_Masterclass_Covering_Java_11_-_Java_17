import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {

    @Test
    public void givenAnEmptyArray_whenReverse_thenEmptyArray() {
        int[] array = {};
        ReverseArray.reverse(array);
        Assert.assertArrayEquals(new int[0], array);
    }

    @Test
    public void givenANullArray_whenReverse_thenNullArray() {
        int[] array = null;
        ReverseArray.reverse(array);
        Assert.assertNull(array);
    }

    @Test
    public void givenOneElementArray_whenReverse_thenOneElementArray() {
        int[] array = {1};
        ReverseArray.reverse(array);
        Assert.assertArrayEquals(new int[]{1}, array);
    }

    @Test
    public void givenAnArrayWithSomeElements_whenReverse_thenArrayWithSomeElementsReversed() {
        int[] array = {1, 2, 3, 4};
        ReverseArray.reverse(array);
        Assert.assertArrayEquals(new int[]{4, 3, 2, 1}, array);
    }
}
