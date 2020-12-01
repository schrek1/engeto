package cz.engeto;

import cz.engeto.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void fakeTest(){
        // given
        int[] inputArray = {2, 10, 3, 4, 10, 40};
        int findingValue = 10;

        // when
        int index = Main.search(inputArray, findingValue);

        Assertions.assertEquals(4, index, "index not equals");
    }

    @Test
    void search_valueIsInArray_shouldReturnLastIndex() {
        // given
        int[] inputArray = {2, 10, 3, 4, 10, 40};
        int findingValue = 10;

        // when
        int index = Main.search(inputArray, findingValue);

        Assertions.assertEquals(4, index, "index not equals");
    }

    @Test
    void search_valueIsNotInArray_shouldReturnNegativeIndex() {
        // given
        int[] inputArray = {2, 3, 4, 10, 40};
        int findingValue = 50;

        // when
        int index = Main.search(inputArray, findingValue);

        Assertions.assertEquals(-1, index, "index not equals");
    }

    @Test
    void search_ArrayIsEmpty_shouldReturnNegativeIndex() {
        // given
        int[] inputArray = {};
        int findingValue = 10;

        // when
        int index = Main.search(inputArray, findingValue);

        // then
        Assertions.assertEquals(-1, index, "index not equals");
    }

    @Test
    void search_ArrayIsNull_shouldReturnNegativeIndex() {
        // given
        int[] inputArray = null;
        int findingValue = 10;

        // when
        int index = Main.search(inputArray, findingValue);

        // then
        Assertions.assertEquals(-1, index, "index not equals");
    }
}
