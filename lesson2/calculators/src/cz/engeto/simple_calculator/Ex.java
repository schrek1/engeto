package cz.engeto.simple_calculator;

public class Ex {

    public static void main(String args[]) {
        double age = 0;
        try {
            age = parseDouble("a");
        } catch (Exception e) {
            e.getMessage();
            throw new RuntimeException("mel jsem chybu pri parsovani veku " + e.getMessage());
        }

        if (age != -1) {
            System.out.println(age);
        }
    }

    static double parseDouble(String text) throws Exception {
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            throw new Exception(text);
        }
    }

}
