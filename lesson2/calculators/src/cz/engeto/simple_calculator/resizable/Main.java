package cz.engeto.simple_calculator.resizable;

public class Main extends Object {

    public static void main(String[] args) {
        ResizableArrayImpl array = new ResizableArrayImpl();
        array.addToEnd(1);
        array.addToEnd(2);
        array.addToEnd(3);
        array.addToEnd(4);
        array.addToEnd(5);

        var clone = array.clone();

        System.out.println(array);
        System.out.println(clone);

        for (int position = 1; position < array.getSize(); position++) {
            System.out.println(array.getAtPosition(position));
        }


    }


}
