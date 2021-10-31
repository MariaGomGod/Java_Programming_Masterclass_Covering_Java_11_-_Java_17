import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void givenANullArray_whenFind_thenItShouldReturnMinusOne() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = null;
        int position = binarySearch.find(18, array);
        Assert.assertEquals(-1, position);
    }

    @Test
    public void givenAnEmptyArray_whenFind_thenItShouldReturnMinusOne() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {};
        int position = binarySearch.find(18, array);
        Assert.assertEquals(-1, position);
    }

    @Test
    public void givenAnArrayWithANumberThatNotExistInside_whenFind_thenItShouldReturnMinusOne() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 8, 10};
        int position = binarySearch.find(18, array);
        Assert.assertEquals(-1, position);
    }

    @Test
    public void givenAnEvenSizedArrayWithTheSameNumbersInside_whenFind_thenItShouldReturnTheMidPosition() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {14, 14, 14, 14};
        int position = binarySearch.find(14, array);
        Assert.assertEquals(1, position);
    }

    @Test
    public void givenAnOddSizedArrayWithTheSameNumbersInside_whenFind_thenItShouldReturnTheMidPosition() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {14, 14, 14, 14, 14};
        int position = binarySearch.find(14, array);
        Assert.assertEquals(2, position);
    }

    @Test
    public void givenAnArrayWithTheMatchingNumberInTheFirstPosition_whenFind_thenItShouldReturnZero() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 14, 14, 14};
        int position = binarySearch.find(1, array);
        Assert.assertEquals(0, position);
    }

    @Test
    public void givenAnArrayWithTheMatchingNumberInTheLastPosition_whenFind_thenItShouldReturnTheLastPosition() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 14, 14, 18};
        int position = binarySearch.find(18, array);
        Assert.assertEquals(3, position);
    }
}
