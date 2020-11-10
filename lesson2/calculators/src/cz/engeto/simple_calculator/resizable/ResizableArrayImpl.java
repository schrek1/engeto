package cz.engeto.simple_calculator.resizable;

import java.util.Arrays;
import java.util.Objects;

public class ResizableArrayImpl implements ResizableArray {

    private int[] array = new int[3];

    private int arrayIndex = 0;

    @Override
    public void addToEnd(int value) {
        if (arrayIndex == array.length) {
            System.out.println("inflate array");
            inflateArray(array.length + 5);
        }
        array[arrayIndex] = value;
        arrayIndex += 1;
        System.out.println("added " + value);
    }

    @Override
    public int getAtPosition(int position) {
        if (position < 1 || position > array.length) throw new IndexOutOfBoundsException();
        return array[convertToArrayIndex(position)];
    }

    @Override
    public void editAtPosition(int position, int value) {
        if (position < 1 || position > array.length) throw new IndexOutOfBoundsException();
        array[convertToArrayIndex(position)] = value;
    }

    @Override
    public int getSize() {
        return convertToPosition(arrayIndex);
    }

    private int convertToArrayIndex(int position) {
        return position - 1;
    }

    private int convertToPosition(int arrayIndex) {
        return arrayIndex + 1;
    }

    private void inflateArray(int size) {
        if (size < array.length) {
            throw new RuntimeException("inflate size is smaller than existing array");
        }

        int[] tmp = new int[size];

        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }

        array = tmp;
    }

    @Override
    public String toString() {
        return "ResizableArrayImpl{" +
                "array=" + Arrays.toString(array) +
                ", arrayIndex=" + arrayIndex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResizableArrayImpl that = (ResizableArrayImpl) o;
        return arrayIndex == that.arrayIndex &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arrayIndex);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public ResizableArrayImpl clone() {
        var copy = new ResizableArrayImpl();
        copy.arrayIndex = this.arrayIndex;
        copy.array = Arrays.copyOf(this.array, this.array.length);
        return copy;
    }
}
