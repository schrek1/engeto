package cz.engeto.simple_calculator;


// Vyuziti behoveho polymorfismu.
abstract class Utvar {
    double dim1;
    double dim2;

    Utvar(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double plocha();
}

class Pravouhelnik extends Utvar {
    Pravouhelnik(double a, double b) {
        super(a, b);
        System.out.println(a);
    }

    // prekryti metody plocha() pro vypocet plochy pravouhelnika
    @Override
    double plocha() {
        System.out.println("Kod metody pro vypocet plochy pravouhelnika.");
        return dim1 * dim2;
    }
}

class Trojuhelnik extends Utvar {
    Trojuhelnik(double a, double b) {
        super(a, b);
    }

    // prekryti metody plocha() pro vypocet plochy trojuhelnika
    @Override
    double plocha() {
        System.out.println("Kod metody pro vypocet plochy trojuhelnika.");
        return dim1 * dim2 / 2;
    }

    double tetiva() {
        return 0;
    }
}

class VypoctiPlochy {
    public static void main(String args[]) {
        Pravouhelnik r = new Pravouhelnik(9, 5);
        Trojuhelnik t = new Trojuhelnik(10, 8);

        Utvar figref;
        figref = r;
        System.out.println("Plocha je " + figref.plocha());
        figref = t;
        System.out.println("Plocha je " + figref.plocha());

        Utvar[] arr = {r, t};
        for (Utvar utvar : arr) {
            System.out.println(utvar.plocha());
        }
    }
}
