package Aufgabe2;

public class Kraftfahrzeug {
    int anzahl_ps;
    String marke;

    public Kraftfahrzeug(int anzahl_ps, String marke) {
        this.anzahl_ps = anzahl_ps;
        this.marke = marke;
    }

 public void ausgeben(){
        System.out.println("Marke: " + marke);
        System.out.println("Anzahl PS: " + anzahl_ps);
    }
}
