package cz.engeto.simple_calculator.resizable;

public interface ResizableArray {
    void addToEnd(int value);

    int getAtPosition(int position);

    void editAtPosition(int position, int value);

    int getSize();

}
