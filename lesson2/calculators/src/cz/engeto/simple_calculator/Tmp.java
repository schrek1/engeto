package cz.engeto.simple_calculator;


class Tmp {

    public enum Day {
        MONDAY(1, "Monday"),
        TUESDAY(2, "Tuesday"),
        WEDNESDAY(3, "Wednesday"),
        THURSDAY(4, "Thursday"),
        FRIDAY(5, "Friday"),
        SATURDAY(6, "Saturday"),
        SUNDAY(7, "Sunday");

        final int dayNumber;
        final String dayName;

        Day(int dayNumber, String dayName) {
            this.dayNumber = dayNumber;
            this.dayName = dayName;
        }

        String dayAndNumber() {
            return dayNumber + " - " + dayName;
        }
    }

    public void tellItLikeItIs(Day day) {

//        Day.MONDAY.dayNumber;
//
//        storeToDb(name);
//        findFromDbByDay(name);

        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;

            case FRIDAY:
                System.out.println("Fridays are better.");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    static void main(String[] args) {
        printArray(createArray(5));
    }

    static String[] createArray(final int size) {
        if (size < 0) return new String[0];
        final String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = "*".repeat(i + 1);
        }
        return array;
    }

    static void printArray(final String[] array) {
        if (array == null) {
            System.out.println("Spatne pole");
            return;
        }
        for (String item : array) System.out.println(item);
    }

}
