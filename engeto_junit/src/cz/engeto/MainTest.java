package cz.engeto;

public class MainTest {

    public static void test_search_valueIsInArray_shouldReturnIndex() {
        // given
        int[] inputArray = {2, 3, 4, 10, 40};
        int findingValue = 10;

        // when
        int index = Main.search(inputArray, findingValue);

        // then
        if (index == 3) {
            System.out.println("test_search_allParamsValid_shouldReturnIndex - ok");
        } else {
            System.err.println("test_search_allParamsValid_shouldReturnIndex - error bad index " + index);
        }

    }

    public static void test_search_valueIsNotInArray_shouldReturnNegativeIndex() {
        // given
        int[] inputArray = {2, 3, 4, 10, 40};
        int findingValue = 50;

        // when
        int index = Main.search(inputArray, findingValue);

        // then
        if (index == -1) {
            System.out.println("test_search_valueIsNotInArray_shouldReturnNegativeIndex - ok");
        } else {
            System.err.println("test_search_valueIsNotInArray_shouldReturnNegativeIndex - error bad index " + index);
        }

    }


    public static void test_search_ArrayIsEmpty_shouldReturnNegativeIndex() {
        // given
        int[] inputArray = {};
        int findingValue = 10;

        // when
        int index = Main.search(inputArray, findingValue);

        // then
        if (index == -1) {
            System.out.println("test_search_allParamsValid_shouldReturnIndex - ok");
        } else {
            System.err.println("test_search_allParamsValid_shouldReturnIndex - error bad index " + index);
        }

    }

    public static void test_search_ArrayIsNull_shouldReturnNegativeIndex() {
        // given
        int[] inputArray = null;
        int findingValue = 10;

        // when
        int index = Main.search(inputArray, findingValue);

        // then
        if (index == -1) {
            System.out.println("test_search_allParamsValid_shouldReturnIndex - ok");
        } else {
            System.err.println("test_search_allParamsValid_shouldReturnIndex - error bad index " + index);
        }

    }


    public static void main(String[] args) {
        test_search_valueIsInArray_shouldReturnIndex();
        test_search_valueIsNotInArray_shouldReturnNegativeIndex();
        test_search_ArrayIsEmpty_shouldReturnNegativeIndex();
        test_search_ArrayIsNull_shouldReturnNegativeIndex();
    }
}
