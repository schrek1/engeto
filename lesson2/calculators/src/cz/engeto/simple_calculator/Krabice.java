package cz.engeto.simple_calculator;

// Tento program deklaruje dva objekty Krabice.

import java.util.Objects;

class Krabice {
    double sirka;
    double vyska;
    double hloubka;

    String jmeno;

    Krabice() {
        jmeno = "neznama";
    }

    Krabice(String jmeno) {
        this.jmeno = jmeno;
    }

    Krabice(double sirka, double vyska, double hloubka, String jmeno) {
        this.sirka = sirka;
        this.vyska = vyska;
        this.hloubka = hloubka;
        this.jmeno = jmeno;
    }

    // vypocet a zobrazeni objemu krabice
    double objem() {
        return sirka * vyska * hloubka;
    }

}

class KrabiceDemo2 {
    public static void main(String args[]) {
        Krabice mojekrabice1 = new Krabice();
        Krabice mojekrabice2 = new Krabice("zelenina");
        Krabice mojekrabice3 = new Krabice(10, 20, 15, "ovoce");

        // prirazeni hodnot promennym instance mojekrabice1
        mojekrabice1.sirka = 10;
        mojekrabice1.vyska = 20;
        mojekrabice1.hloubka = 15;
        mojekrabice1.jmeno = "ovoce";

        // prirazeni jinych hodnot promennym instance mojekrabice2
        mojekrabice2.sirka = 3;
        mojekrabice2.vyska = 6;
        mojekrabice2.hloubka = 9;

        // vypocet objemu prvni krabice
        System.out.println("Objem krabice 1 je " + mojekrabice1.objem());

        // vypocet objemu druhe krabice
        System.out.println("Objem krabice 2 je " + mojekrabice2.objem());

    }
}
