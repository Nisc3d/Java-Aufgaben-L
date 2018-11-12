package Aufgabe2;

public class Motorrad extends Kraftfahrzeug {

    public Motorrad(int anzahl_ps, String marke) {
        super(anzahl_ps, marke);
    }

    public void ausgeben() {
        System.out.println("Art: Motorrad");
        super.ausgeben();
        System.out.println("");
    }
}
